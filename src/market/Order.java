package market;

public class Order {
    private Customer customer;
    private String details;

    public Order(Customer customer, String details) {
        this.customer = customer;
        this.details = details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDetails() {
        return details;
    }
}
