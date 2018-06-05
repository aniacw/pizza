package main.menu;

import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class CancelOrderMenu extends Menu {
    public CancelOrderMenu() {
        super("cancel oder menu");
    }

    @Override
    public Menu process() {
        System.out.println("Please type the ID of the order to be cancelled");
        Scanner scanner = new Scanner(System.in);
        int idToCancel = scanner.nextInt();
        try {
            system.getDataBase().getOrders().removeIf(i -> system.getDataBase().findOrderById(idToCancel));
            System.out.println("order no " + idToCancel + " cancelled");
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
