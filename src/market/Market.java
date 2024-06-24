package market;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Customer> customerQueue;
    private Queue<Order> orderQueue;

    public Market() {
        customerQueue = new LinkedList<>();
        orderQueue = new LinkedList<>();
    }

    // Методы интерфейса QueueBehaviour
    @Override
    public void addToQueue(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Клиент " + customer.getName() + " добавлен в очередь.");
    }

    @Override
    public void removeFromQueue() {
        Customer removedCustomer = customerQueue.poll();
        if (removedCustomer != null) {
            System.out.println("Клиент " + removedCustomer.getName() + " удален из очереди.");
        } else {
            System.out.println("Нет клиентов в очереди на удаление.");
        }
    }

    @Override
    public Customer peekQueue() {
        return customerQueue.peek();
    }

    @Override
    public boolean isQueueEmpty() {
        return customerQueue.isEmpty();
    }

    // Методы интерфейса MarketBehaviour
    @Override
    public void acceptOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Заказ от клиента " + order.getCustomer().getName() + " принят.");
    }

    @Override
    public void releaseOrder() {
        Order releasedOrder = orderQueue.poll();
        if (releasedOrder != null) {
            System.out.println("Заказ от клиента " + releasedOrder.getCustomer().getName() + " выдан.");
        } else {
            System.out.println("Нет заказов.");
        }
    }

    // Метод обновления состояния магазина
    public void update() {
        if (!isQueueEmpty()) {
            Customer customer = peekQueue();
            Order order = new Order(customer, "Детали заказа");
            acceptOrder(order);
            removeFromQueue();
        }
        releaseOrder();
    }
}
