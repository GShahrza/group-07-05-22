package main.java.lesson_32;

import java.lang.reflect.Method;

public class AnnotationCreate {

    public static void main(String[] args)throws Exception  {
            System.out.println("Testing...");
            int passed = 0, failed = 0, count = 0, ignore = 0;
            TestExample testExample = new TestExample();
            Class<TestExample> obj= (Class<TestExample>) testExample.getClass();


            for(Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Test.class)) {
                    Test test = method.getAnnotation(Test.class);

                    if (test.enabled()) {
                        try {
                            method.invoke(obj.getConstructor().newInstance());
                            System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                            passed++;
                        } catch (Throwable ex) {
                            System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                            failed++;
                        }
                    } else{
                        System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                        ignore++;
                    }

                }
            }
            System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);


    }
}
