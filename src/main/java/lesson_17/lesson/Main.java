package main.java.lesson_17.lesson;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Shahrza");
        user.setSurname("Gahramanov");
        user.setGender(EGender.MALE);

        System.out.println(user.getGender().getExample());
    }
}
