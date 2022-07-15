package main.java.lesson_27.warmup;

public class PoliMorfizm extends  AB{

    int a=8;





    public static void main(String[] args) {
        PoliMorfizm ab= new PoliMorfizm();
        ab.ucan();
        System.out.println(ab.a);
    }

}
 class AB{

    int a=5;

    void ucan (){

        System.out.println("ucan");
    }
}
