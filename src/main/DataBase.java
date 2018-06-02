package main;

import main.exception.OrderNotFoundException;
import main.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SystemComponent {
    private List<User> users;
    private List<Customer> customers;
    private List<Admin> admins;
    private List<Employee> employees;
    private List<Order> orders;
    private List<Order> archivedOrders;

    public DataBase() {
        this.users = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.archivedOrders = new ArrayList<>();
    }

    public User findUserByLogin(String login) throws UserNotFoundException {
        for (User u : users)
            if (u.getLogin().equals(login))
                System.out.println("login OK");
            else {
                System.out.println("invalid login, try again");
            }
        return u; //??
    }

    public Order findOrderById(int id) throws OrderNotFoundException { //??
        for (Order o : orders)
            if (o.getId() == id)
                System.out.println("ID found");
            else {
                System.out.println("Invalid id, try again");
            }
        return o; //??
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
