package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order extends SystemComponent {

    private static int lastId = 0;
    private int id;
    //wiecej pizz
    private List<Pizza> pizza;
    private User customer;
    private float summaryPrice;
    private Date orderDate;


    public Order(List<Pizza> pizza, User customer) {
        this.id = lastId++;
        this.pizza = new ArrayList<>();
        this.customer = customer;
        //this.orderDate = toda
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

    public String getCustomerFullName() {
        return system.getDataBase().;
    }

    public void editPizza(int newTopping){


    }
}
