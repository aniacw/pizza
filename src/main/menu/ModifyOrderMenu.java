package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class ModifyOrderMenu extends Menu {
    public ModifyOrderMenu() {
        super("modify order");
    }

    public ModifyOrderMenu(String name) {
        super(name);
    }

    public static Order foundOrder;

    @Override
    public Menu process() {
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            int orderIdToModify = in.nextInt();
            foundOrder = system.getDataBase().findOrderById(orderIdToModify);
            displayMenu();
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
