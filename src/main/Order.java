package main;

public class Order extends SystemComponent {

    private static int lastId = 0;
    private int id;
    //wiecej pizz
    private Pizza pizza;
    private User customer;
    private float summaryPrice;

    public Order(Pizza pizza, User customer) {
        this.id = lastId++;
        this.pizza = pizza;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void editPizza(String newTopping){


    }
}
