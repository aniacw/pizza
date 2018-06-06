package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;
import java.util.function.Predicate;

public class CancelOrderMenu extends Menu {
    public CancelOrderMenu() {
        super("cancel oder menu");
    }

    private static class Condition implements Predicate<Order>{
        private int idToCancel;

        public Condition(int idToCancel) {
            this.idToCancel = idToCancel;
        }

        @Override
        public boolean test(Order i) {
            return i.getId() == idToCancel;
        }
    }

    @Override
    public Menu process() {
        System.out.println("Please type the ID of the order to be cancelled");
        Scanner scanner = new Scanner(System.in);
        int idToCancel = scanner.nextInt();

        if (system.getDataBase().getOrders().removeIf(i -> i.getId() == idToCancel))
            System.out.println("order no " + idToCancel + " cancelled");
        else
            System.out.println("order no " + idToCancel + " not found");

        return parent;
    }
}
