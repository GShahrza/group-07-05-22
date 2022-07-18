package main.java.lesson_28.lesson;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
//            saewop();
            System.out.println("bolundu= ");
           throw  new Exception("SD",new Throwable());
//            int i = 6 / 0;

        }   catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (NullPointerException n){
           n.printStackTrace();
        }catch (Exception n){
            System.out.println(n.getMessage());
        }

    }

    static void sd() {


        RuntimeException runtimeException = new RuntimeException();
        new RuntimeException();
    }

    static void saewop() {
        String a= new String("salam");
        a=null;

//      String a=null;
      a.length();
    }

    void  dfsf(){
        try {
           while (true){
               System.out.println("Sfg");
               break;
           }
//            int i = 5 / 0;
//            throw new RuntimeException();
            throw new ArrayIndexOutOfBoundsException();  // DOES
        } catch (Exception e) {
        }
        finally {
            System.out.println("");
        }
    }

     void multicaht(){
         try {
             throw new IOException();
         } catch (RuntimeException | IOException p) {



         } // DOES


    }
}
