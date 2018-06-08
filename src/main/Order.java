package main;

import java.util.ArrayList;
import java.util.List;

public class Order extends SystemComponent {

    private static int lastId = 0;
    private int id;
    //wiecej pizz
    private List<Pizza> pizza;
    private User customer;
    private float summaryPrice;

    public Order(List<Pizza> pizza, User customer) {
        this.id = lastId++;
        this.pizza = new ArrayList<>();
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void addPizza(Pizza p){
        pizza.add(p);
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public User getCustomer() {
        return customer;
    }

    public void editPizza(int newTopping){


    }
}
