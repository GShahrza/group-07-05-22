package main.java.lesson_29.lesson;


public class MainTestExp {

    public static void main(String[] args) {
        try {
           MainTestExp mainTestExp= new MainTestExp();
           mainTestExp.checkSufficient(200);
           mainTestExp.balanceCheck("12345");
           System.exit(0);
            System.out.println("Isledi");
        }catch (BalansBosdur e){
            System.out.println(e.getMessage());
        }catch (Exception b){
            System.out.println(b.getMessage());
        }finally {
            System.out.println("isledi bitti");
        }
    }

    void balanceCheck(String account){
        switch (account){
            case  "12345":
                System.out.println("balance ok");
                break;
            default:
                throw  new BalansBosdur();

        }
    }

    void checkSufficient(Integer amount){
        int balans=300;
        if(amount> balans)
        throw  new BalanceInsufficient("Kifayet qeder balans yoxdur" ) ;
    }
}


class BalansBosdur extends RuntimeException{

    public BalansBosdur() {
        super("kifayet qeder balans yoxdu");
    }
}

class BalanceInsufficient extends RuntimeException{
    public BalanceInsufficient(String message) {
        super(message);
    }
}
