package main.menu;

import java.util.Scanner;

public class CheckOrders extends Menu {

    public CheckOrders() {
        super("check orders");
    }

    public CheckOrders(String name) {
        super(name);
    }

    @Override
    public Menu process() {
        System.out.println("Select ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        displayMenu();
        return parent;
    }
}
