package VendingMachine.impl;

import VendingMachine.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {

    private float volume;

    private String pack;

    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean b, String material, float v){
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}
