package main.menu;

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
        system.getDataBase().findOrderByCustomer(fullName)

        return parent;
    }
}
