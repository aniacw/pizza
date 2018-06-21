package main.menu;

import main.PizzaSystem;

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
        PizzaSystem.getInstance().getDataBase().getArchivedOrders().add(PizzaSystem.getInstance().getDataBase().getOrders().get(o));
        PizzaSystem.getInstance().getDataBase().getOrders().remove(o);
        return parent;
    }
}
