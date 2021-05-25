package lesson6;

import java.util.Date;

public class Deal {
    public static void main(String[] args) {
        confirmDeal();
        System.out.println(checkPrice());
        System.out.println(isValidType());
    }


    long id;
    public static int price;
    public static Date dateCreated;
    public static boolean isConfirmed;
    public static Date dateConfirmed;
    public static String city;
    public static String country;
    public static String type;

    public Deal(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Deal() {
    }


    public static void confirmDeal() {
        isConfirmed = true;
        dateConfirmed = new Date();
        System.out.println(new Date());
        System.out.println(isConfirmed);
    }

    public static boolean checkPrice() {
        if (price > 1000)
            isConfirmed = true;
        else
            isConfirmed = false;

        return isConfirmed;
    }

    public static boolean isValidType() {
        if (type == "Buy" || type == "Sale")
            isConfirmed = true;
        else
            isConfirmed = false;
        return isConfirmed;
    }
}
