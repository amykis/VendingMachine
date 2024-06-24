package market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Customer customer1 = new Customer("Иван");
        Customer customer2 = new Customer("Пётр");
        Customer customer3 = new Customer("Геннадий");
        Customer customer4 = new Customer("Ольга");
        Customer customer5 = new Customer("Надежда");
        Customer customer6 = new Customer("Алексей");

        market.addToQueue(customer1);
        market.addToQueue(customer2);
        market.addToQueue(customer3);
        market.addToQueue(customer4);
        market.addToQueue(customer5);
        market.addToQueue(customer6);

        market.update();
        market.update();
        market.update();
        market.update();
        market.update();
    }
}
