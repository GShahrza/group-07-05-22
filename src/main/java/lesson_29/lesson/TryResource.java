package main.java.lesson_29.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) {

    }
    public void readFile(String file) throws Exception  {
        try (var is = new
                FileInputStream("myfile.txt");var is2 = new
                FileInputStream("myfile.txt")) {

        }

    }
}
