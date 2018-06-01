package main;

import main.menu.ExecuteOrderMenu;
import main.menu.Menu;
import main.menu.SendMessageMenu;

public class Employee extends User {

    protected Menu menu;

    private static final Menu EMPLOYEE_MENU =
            new Menu("main",
                    new ExecuteOrderMenu(),
                    new SendMessageMenu()
            );

    public Employee(String login, String password) {
        super(login, password);
        this.menu = EMPLOYEE_MENU;
    }



}
