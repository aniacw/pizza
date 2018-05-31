package main;

import main.menu.CreateAccountMenu;
import main.menu.CreateOrderMenu;
import main.menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{

    private Integer phone;
    private List<Order> orderHistory;
    protected Menu menu;
    private boolean hasAdminRights;

    private static final Menu CUSTOMER_MENU =
            new Menu("main",
                    new CreateOrderMenu(),
                    new CreateAccountMenu()
            );

    public Customer(String login, String password) {
        super(login, password);
        this.menu = CUSTOMER_MENU;
        this.phone = null;
        this.orderHistory = new ArrayList<>();
        this.hasAdminRights = false;
    }

    public void makeOrder(){

    }

}