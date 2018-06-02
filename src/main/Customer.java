package main;

import main.menu.*;

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
                    new SendMessageMenu(),
                    new DeleteOrderMenu(),
                    new EditContactDataMenu(),
                    new ChangePasswordMenu()
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

    public void makeAdmin(User user){
        this.hasAdminRights = true;
    }

    public void changePhone(Integer newNumber){
        this.phone = newNumber;  // czy setter?
    }
    public Customer getLoggedCustomer(){
        return this; ///???
    }

}