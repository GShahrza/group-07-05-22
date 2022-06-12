package main.java.lesson_13.warmup;

import main.java.lesson_13.warmup.dao.model.User;
import main.java.lesson_13.warmup.dao.respository.UserRepository;

import java.util.Scanner;

public class ConsoleApplication {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        boolean choose = false;
        String input = "";

        while (true) {
            String menu = "1.Login\n2.Sign up\n3.Exit\n\n" + "Please choose one!";
            System.out.println(menu);
            input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("login") || input.equals("1")) {
                System.out.print("Username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();

                User[] users = UserRepository.users;

                for (int i = 0; i < users.length; i++) {
                    User user = users[i];
                    if (user != null) {
                        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                            choose = true;
                            while (true) {
                                System.out.println("1.Update\n2.Delete\n3.Exit\n");
                                String ch = new Scanner(System.in).next();
                                if (ch.equalsIgnoreCase("update")) {
                                    System.out.print("name: ");
                                    String name = sc.next();
                                    System.out.print("surname: ");
                                    String surname = sc.next();

                                    user.setName(name);
                                    user.setSurname(surname);

                                    UserRepository.update(users[i], i);
                                } else if (ch.equalsIgnoreCase("delete")) {
                                    UserRepository.delete(users[i]);
                                } else if (ch.equalsIgnoreCase("exit")) {
                                    break;
                                } else {
                                    System.out.println("wrong choose");
                                }
                            }
                        }
                    }
                    if (!choose) {
                        System.out.println("Wrong username and password");
                    }
                }
            } else if (input.equalsIgnoreCase("sign up") || input.equals("2")) {
                System.out.print("name: ");
                String name = sc.next();
                System.out.print("surname: ");
                String surname = sc.next();
                System.out.print("username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();
                System.out.print("age: ");
                short age = sc.nextShort();

                User user = new User(name, surname, username, password, age);
                UserRepository.addUser(user);
            } else if (input.equals("3") || input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Wrong input!Please try again");
            }

        }

    }
}
