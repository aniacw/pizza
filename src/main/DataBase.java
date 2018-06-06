package main;

import main.exception.OrderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SystemComponent {
    private List<Customer> customers;
    private List<Admin> admins;
    private List<Employee> employees;
    private List<Order> orders;
    private List<Order> archivedOrders;
    private List<String> toppings;

    public DataBase() {
        this.customers = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.employees = new ArrayList<>();
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

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
