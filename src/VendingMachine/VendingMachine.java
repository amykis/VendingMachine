package VendingMachine;

import VendingMachine.impl.HotDrinks;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProduct(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

        for (Product product : products) {
            if(product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrinks) {
                HotDrinks hotDrink = (HotDrinks) product;
                if (hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature) {
                    products.remove(hotDrink);
                    return hotDrink;
                }
            }
        }
        return null; // В случае если продукт не найден
    }
}
