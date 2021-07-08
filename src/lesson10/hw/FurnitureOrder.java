package lesson10.hw;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwner, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwner);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        boolean validateOrder = false;
        if (getShipFromCity() == "Kyiv" && getShipFromCity() == "Lviv") {
            validateOrder = true;
        }
        if (getBasePrice() >= 500)
            validateOrder = true;
        if (getCustomerOwner().getName() != "Test")
            validateOrder = true;
        if (validateOrder == true)
            setDateConfirmed(new Date());
    }

    @Override
    void calculatePrice() {
        double shipPrice = 0;
        setTotalPrice(getBasePrice() + shipPrice);
        if (getTotalPrice() < 5000) {
            shipPrice = getTotalPrice() * 0.05;
        } else {
            shipPrice = getTotalPrice() * 0.02;
        }
    }

    @Override
    void confirmShipping() {
        super.confirmShipping();
    }
}
