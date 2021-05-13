package lesson6;

public class Car {
    public static void main(String[] args) {
       startRun();
    }

    //1. fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    //2. constructors. каким образом объект будет создаваться.(можно обойтись без них)(количество <= 3)

    // Car - тип возвращаемого значения.
    public Car(int price, int yearOfManufacturing, String ownerName) {

        // this - указатель на текущий класс. Содержит в себе все содержимое текущего класса.
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }

    //3. methods. поведение класса.
    static void startRun() {
        System.out.println("I am running...");
    }

    static void stopRun() {
        System.out.println("I am stopping...");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }

    //4. inner class
    private class Test {

    }
}
