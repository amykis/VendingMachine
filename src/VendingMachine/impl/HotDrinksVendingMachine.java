package VendingMachine.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Product;

import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {

    public HotDrinksVendingMachine() {
        super();
    }

    public HotDrinksVendingMachine(List<Product> products) {
        super(products);
    }
}
