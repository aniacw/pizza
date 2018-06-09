package main;

import main.exception.OrderNotFoundException;
import main.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SystemComponent {
    private List<Order> orders;
    private List<Order> archivedOrders;
    private List<String> toppings;

    public DataBase() {
        this.orders = new ArrayList<>();
        this.archivedOrders = new ArrayList<>();
        this.toppings = new ArrayList<>();
    }

    public Order findOrderById(int id) throws OrderNotFoundException {
        for (Order o : orders)
            if (o.getId() == id)
               return o;
        //return null;
        throw new OrderNotFoundException(id);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public Order findOrderByCustomer(String fullName) throws UserNotFoundException {
        for (Order o : orders)
            if (o.getCustomerFullName().equals(fullName))
                return o;
        throw new UserNotFoundException();
    }
}
