package main.menu;

import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class ModifyOrderMenu extends Menu {
    public ModifyOrderMenu(){
        super("modify order menu");
    }

    public ModifyOrderMenu(String name) {
        super(name);
    }

    @Override
    public Menu process(){
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            int orderId = in.nextInt();
            system.getDataBase().findOrderById(orderId);
            displayMenu();
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
