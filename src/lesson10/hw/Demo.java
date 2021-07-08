package lesson10.hw;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Alex", "Kyiv", "Female");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("PlayStation", new Date(), "Kyiv", "Odesa", 600, customer, 12);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("PlayStation", new Date(), "Lviv", "Yalta", 100, customer, 12);
        electronicsOrder.calculatePrice();
        electronicsOrder.validateOrder();
        electronicsOrder.confirmShipping();
        System.out.println(electronicsOrder.getTotalPrice());
        System.out.println(electronicsOrder2.getShipFromCity());

        FurnitureOrder furnitureOrder = new FurnitureOrder("MacBook", new Date(), "Dnipro", "Odesa", 5000, customer, "Maco");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("MacBook", new Date(), "Kherson", "Kyiv", 6900, customer, "Maco");
        furnitureOrder.calculatePrice();
        furnitureOrder.validateOrder();
        furnitureOrder.confirmShipping();
        System.out.println(furnitureOrder.getTotalPrice());
        System.out.println(furnitureOrder2.getShipToCity());
    }
}
