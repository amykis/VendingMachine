package market;

public interface QueueBehaviour {
    void addToQueue(Customer customer);
    void removeFromQueue();
    Customer peekQueue();
    boolean isQueueEmpty();
}
