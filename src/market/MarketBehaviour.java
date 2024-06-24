package market;

public interface MarketBehaviour {
    void acceptOrder(Order order);
    void releaseOrder();
}
