package lesson10.hw;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonth;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwner, int guaranteeMonth) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwner);
        this.guaranteeMonth = guaranteeMonth;
    }

    @Override
    void validateOrder() {
        boolean validateOrder = false;
        if (getShipFromCity() == "Kyiv" && getShipFromCity() == "Odesa" && getShipFromCity() == "Kharkiv" && getShipFromCity() == "Dnipro") {
            validateOrder = true;
        }
        if (getShipToCity() == "Kyiv" || getShipToCity() == "Odesa" || getShipToCity() == "Kharkiv" || getShipToCity() == "Dnipro") {
            validateOrder = true;
        }
        if (getBasePrice() >= 100) {
            validateOrder = true;
        }
        if (getCustomerOwner().getGender() == "Female") {
            validateOrder = true;
        }
        if (validateOrder == true)
            setDateConfirmed(new Date());
    }

    @Override
    void calculatePrice() {
        double shipPrice = 0;
        setTotalPrice(getBasePrice() + shipPrice);
        if (getShipToCity() != "Kyiv" && getShipToCity() != "Odesa") {
            shipPrice = getTotalPrice() * 0.15;
        } else {
            shipPrice = getTotalPrice() * 0.1;
        }
        if (getTotalPrice() > 1000) {
            setTotalPrice(getTotalPrice() - shipPrice);
            setTotalPrice(getTotalPrice() * 0.95);
        }
    }

    @Override
    void confirmShipping() {
        super.confirmShipping();
    }
}
