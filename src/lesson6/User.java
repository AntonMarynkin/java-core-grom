package lesson6;

import java.util.Date;

public class User {
    public static void main(String[] args) {
        logIn();
    }

    String name;
    int age;
    String city;
    static Date lastActiveDate;
    boolean isActive;

    public User() {
    }

    public User(String name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }


    static void logIn() {
        lastActiveDate = new Date();
        System.out.println(new Date());
    }

    void isActive(boolean status) {
        isActive = status;
    }

    void increaseAge() {
        age++;
    }
}
