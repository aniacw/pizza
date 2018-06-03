package main.menu;

import java.util.Scanner;

public class CancelOrderMenu extends Menu {
    public CancelOrderMenu(){
        super("cancel oder menu");
    }

    @Override
    public Menu process(){
        System.out.println("Please type the ID of the order to be cancelled");
        Scanner scanner = new Scanner(System.in);
        int idToCancel = scanner.nextInt();
        system.getDataBase().getOrders().remove(idToCancel);
        System.out.println("order no " + idToCancel + " cancelled");
        return parent;
    }
}
