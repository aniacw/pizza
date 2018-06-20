package main.menu;

import java.util.Scanner;

public class ExecuteOrderMenu extends Menu {

    public ExecuteOrderMenu() {
        super("execute order");
    }

    @Override
    public Menu process() {
        System.out.println("Please type order id to execute");
        Scanner scanner = new Scanner(System.in);
        int o = scanner.nextInt();
        system.getDataBase().getArchivedOrders().add(system.getDataBase().getOrders().get(o));
        system.getDataBase().getOrders().remove(o);
        return parent;
    }
}
