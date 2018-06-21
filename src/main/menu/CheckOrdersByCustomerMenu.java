package main.menu;

import main.Order;
import main.PizzaSystem;
import main.exception.UserNotFoundException;

import java.util.Scanner;

public class CheckOrdersByCustomerMenu extends CheckOrders {
    public CheckOrdersByCustomerMenu() {
        super("check orders by customer");
    }

    @Override
    public Menu process() {
        System.out.println("Please type the full name of the customer");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.next();

        try {
            Order found = PizzaSystem.getInstance().getDataBase().findOrderByCustomer(fullName);
            System.out.println(found);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        return parent;
    }
}
