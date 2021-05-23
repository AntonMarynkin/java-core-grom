package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.Deal;
import lesson6.User;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        //two options to create object
        // class name (type) object name = new class name ();
        // class name (type) object name = new class name (attributes);

        User user = new User("Lucky");
        User user1 = new User("Joker", 21, "Kyiv", new Date(), true);
        User user3 = new User();

        Car car = new Car(7000, 2018, "Anton");

        DbConnector dbConnector = new DbConnector();

        createDeal();
        createDealAndCallMethods();
    }

    public static Deal createDeal() {
        Deal deal = new Deal();

        deal.price = 100;
        deal.dateCreated = new Date();
        deal.isConfirmed = false;
        deal.dateConfirmed = null;
        deal.city = "Dnepr";
        deal.country = "Ukraine";
        deal.type = "Buy";

        System.out.println(deal.country);

        return deal;
    }

    public static Deal createDealAndCallMethods() {
        Deal deal2 = new Deal();

        deal2.price = 100;
        deal2.dateCreated = new Date();
        deal2.isConfirmed = true;
        deal2.dateConfirmed = new Date();
        deal2.city = "Kiev";
        deal2.country = "Ukraine";
        deal2.type = "SomeValue";

        deal2.confirmDeal();
        deal2.checkPrice();
        deal2.isValidType();

        return deal2;
    }
}
