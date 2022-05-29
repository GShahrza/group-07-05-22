package main.java.lesson_11.lesson;

public class Car {

    private String type;
    private String weight;
    private String color;
    private int door;

    public Car() {
    }

    public Car(String type, String weight, String color, int door) {
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.door = door;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
