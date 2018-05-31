package main;

import main.menu.ExecuteOrderMenu;
import main.menu.Menu;

public class Employee extends User{

    protected Menu menu;

    private static final Menu EMPLOYEE_MENU =
            new Menu("main",
                    new ExecuteOrderMenu()
            );

    public Employee(String login, String password) {
        super(login, password);
        this.menu = EMPLOYEE_MENU;
    }



}
