package VendingMachine.impl;

import VendingMachine.Product;

import java.time.LocalDate;

public class HotDrinks extends Product {

    private int temperature;

    public HotDrinks(String name, double price, LocalDate releaseDate, boolean b, String material, float v) {
        super(name, price, releaseDate);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "temperature=" + temperature +
                '}';
    }
}
