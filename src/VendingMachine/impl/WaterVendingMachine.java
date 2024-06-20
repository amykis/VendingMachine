package VendingMachine.impl;

import VendingMachine.Product;
import VendingMachine.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
