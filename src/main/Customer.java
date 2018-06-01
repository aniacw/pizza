package main;

import main.menu.CreateAccountMenu;
import main.menu.CreateOrderMenu;
import main.menu.Menu;
import main.menu.SendMessageMenu;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private Integer phone;
    private List<Order> orderHistory;
    protected Menu menu;
    private boolean hasAdminRights;

    private static final Menu CUSTOMER_MENU =
            new Menu("main",
                    new CreateOrderMenu(),
                    new CreateAccountMenu(),
                    new SendMessageMenu()
            );

    public Customer(String login, String password) {
        super(login, password);
        this.menu = CUSTOMER_MENU;
        this.phone = null;
        this.orderHistory = new ArrayList<>();
        this.hasAdminRights = false;
    }

    public void setHasAdminRights(boolean hasAdminRights) {
        this.hasAdminRights = hasAdminRights;
    }

    public boolean isHasAdminRights() {
        return hasAdminRights;
    }

    public void makeOrder(){

    }

}