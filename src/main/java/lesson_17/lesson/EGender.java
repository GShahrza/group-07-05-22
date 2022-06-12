package main.java.lesson_17.lesson;

public enum EGender {
    MALE("M"),
    FEMALE("F"),
    OTHERS("O");


    private String example;

    EGender(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }
}
