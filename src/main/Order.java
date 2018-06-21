package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order  {

    public static final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private static int lastId = 0;
    private int id;
    private List<Pizza> pizza;
    private User customer;
    private float summaryPrice;
    private Date orderDate;


    public Order(List<Pizza> pizza, User customer) {
        this.id = lastId++;
        this.pizza = new ArrayList<>();
        this.customer = customer;
        this.orderDate = Calendar.getInstance().getTime();
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

    public Date getOrderDate() {
        return orderDate;
    }
}
