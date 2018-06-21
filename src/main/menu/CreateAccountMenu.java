package main.menu;

import main.PizzaSystem;
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
        User user;
        if (role.equalsIgnoreCase("customer")) {
            user = User.createCustomer(login, pass);
        }
        else if (role.equalsIgnoreCase("employee")){
            user = User.createEmployee(login, pass);
        }
        else if (role.equalsIgnoreCase("admin")){
            user  = User.createAdmin(login, pass);
        }
        else{
            System.out.println("Invalid user role");
            return parent;
        }
        PizzaSystem.getInstance().addUser(user);
        return parent;
    }
}
