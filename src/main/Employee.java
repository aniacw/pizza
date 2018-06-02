package main;

import main.menu.*;

public class Employee extends User {

    protected Menu menu;

    private static final Menu EMPLOYEE_MENU =
            new Menu("main",
                    new ExecuteOrderMenu(),
                    new SendMessageMenu(),
                    new CheckOrders(),
                    new ChangePasswordMenu()
            );

    public Employee(String login, String password) {
        super(login, password);
        this.menu = EMPLOYEE_MENU;
    }

    public void prepareOrder(Order order) {
        System.out.println("order " + order.getId() + "  prepared");
    }


}
