package main.java.lesson_31;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Class<Student> sa = (Class<Student>) Class.forName("main.java.lesson_31.Student");
//
//        Field[] fields = sa.getDeclaredFields();
//        for (Field field : fields) {
////            field.setAccessible(true);
//            System.out.println(field.getName());
//        }

        ASE ase= new ASE();
        ase.nese();


        Class<Student> clazz =  (Class<Student>) Class.forName("main.java.lesson_31.Student");
        Constructor<Student> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student cc = declaredConstructor.newInstance();
//        Student cc = clazz.getDeclaredConstructor().newInstance();
//        Student cc1 = clazz.getDeclaredConstructor(String.class).newInstance("asakj");
        Field f1 = cc.getClass().getDeclaredField("name");

        f1.setAccessible(true);
        f1.set(cc, "Etibar");
//        String str1 = (String) f1.get(cc);



        System.out.println("field: " + cc.getName());

//
//        Constructor<Student> declaredConstructor = sa.getDeclaredConstructor(String.class);
//        System.out.println( declaredConstructor.getName());
//        Student sabir = declaredConstructor.newInstance("Sabir");
//
//        Field name = sa.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(Student.class, "Etibar");
//
//        System.out.println(sabir.getName());


//        Student student = sa.newInstance();

    }

}
class  ASE{

    @Deprecated(since = "nese  ethodunda buglar tapilib", forRemoval = true)
    void  nese(){

    }
}

