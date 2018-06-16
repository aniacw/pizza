package main;

import main.exception.OrderNotFoundException;
import main.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SystemComponent {
    private List<Order> orders;
    private List<Order> archivedOrders;
    private RestaurantMenu restaurantMenu;

    public DataBase() {
        this.orders = new ArrayList<>();
        this.archivedOrders = new ArrayList<>();
        this.restaurantMenu = new RestaurantMenu();
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

    public Order findOrderByCustomer(String fullName) throws UserNotFoundException {
        for (Order o : orders)
            if (o.getCustomer().getFullName().equals(fullName))
                return o;
        throw new UserNotFoundException(fullName);
    }

    public RestaurantMenu getRestaurantMenu() {
        return restaurantMenu;
    }
}
