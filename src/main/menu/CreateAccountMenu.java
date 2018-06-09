package main.menu;

import main.User;

import java.util.Scanner;

public class CreateAccountMenu extends Menu {
    public CreateAccountMenu(){
        super("create account");
    }

    @Override
    public Menu process(){
        System.out.println("Please type new login");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.next();
        System.out.println("Please set the password");
        String pass = scanner.next();
        System.out.println("create customer, employee or admin? Type one");
        String role = scanner.next();
        User newUser = new User();
        if (role.equalsIgnoreCase("customer")) {
            newUser.createCustomer(login, pass);
        }
        if (role.equalsIgnoreCase("employee")){
            newUser.createEmployee(login, pass);
        }
        if (role.equalsIgnoreCase("admin")){
            newUser.createAdmin(login, pass);
        }
        return parent;
    }
}
