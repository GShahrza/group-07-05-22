package main.java.lesson_32;

import java.lang.reflect.Field;

public class AnnotationExp1 {
    public static void main(String[] args) {
        TestExample2 t2 = new TestExample2();
        Class<TestExample2> example2Class = (Class<TestExample2>) t2.getClass();

        for (Field field:example2Class.getFields()){
            if(field.isAnnotationPresent(CheckPoint.class)){
                try {
                    if((Integer)field.get(example2Class.getConstructor().newInstance())>7){
                        System.out.println(field.getName() + "  Yas uygundu");
                    }else {
                        throw new NotValidAge(field.getName()+" yasi dusmur");
                    }
                }catch (NotValidAge ex){
                    System.out.println( ex.getMessage());
                }
                catch (Exception el){
                    el.printStackTrace();
                }
            }

        }

    }
}
class NotValidAge extends Exception{

    public NotValidAge(String message) {
        super(message);
    }
}
