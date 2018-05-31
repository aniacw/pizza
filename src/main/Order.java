package main;

public class Order {

    private static int lastId = 0;
    private int id;
    private Pizza pizza;
    private Customer customer;

    public Order(Pizza pizza, Customer customer) {
        this.id = lastId++;
        this.pizza = pizza;
        this.customer = customer;
    }
}
