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
        boolean validateOrder;
        if (getShipFromCity() == "Kyiv" && getShipFromCity() == "Odesa" && getShipFromCity() == "Kharkiv" && getShipFromCity() == "Dnipro")
            validateOrder = true;
        if (getShipToCity() == "Kyiv" || getShipToCity() == "Odesa" || getShipToCity() == "Kharkiv" || getShipToCity() == "Dnipro")
            validateOrder = true;
        if (getBasePrice() == 100)
            validateOrder = true;
        if (getCustomerOwner().getGender() == "Female")
            validateOrder = true;
    }

    @Override
    void calculatePrice() {

    }
}
