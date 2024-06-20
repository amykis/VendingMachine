package VendingMachine;

import VendingMachine.impl.*;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1), true, EPackage.GLASS.getMaterial(), 0.5F);

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vmWater = new WaterVendingMachine();

        System.out.println(vmWater.getProducts());

        vmWater.addProduct(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vmWater.getProducts());

        vmWater.getProduct("Родники");

        System.out.println(vmWater.getProducts());

        Product hotDrink1 = new HotDrinks("Coffee cappuccino", 150, LocalDate.of(2024, 6, 20),
                true, EPackage.PAPER.getMaterial(), 0.3F);
        Product hotDrink2 = new HotDrinks("Coffee latte", 150, LocalDate.of(2024, 6, 20),
                true, EPackage.PAPER.getMaterial(), 0.3F);

        VendingMachine vmHotDrinks = new HotDrinksVendingMachine();

        System.out.println(vmHotDrinks.getProducts());

        vmHotDrinks.addProduct(List.of(hotDrink1, hotDrink1, hotDrink1, hotDrink2, hotDrink2, hotDrink2));

        System.out.println(vmHotDrinks.getProducts());

        vmHotDrinks.getProduct("Coffee cappuccino");

        System.out.println(vmHotDrinks.getProducts());
    }
}
