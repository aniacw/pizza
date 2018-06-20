package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class FindOrderMenu extends Menu {
    public FindOrderMenu() {
        super("find order");
    }

    protected Order foundOrder;
    public ModifyOrderMenu modifyOrderMenu;

    public FindOrderMenu(String name) {
        super(name);
    }

    @Override
    public Menu process() {
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            foundOrder = system.getDataBase().findOrderById(in.nextInt());

        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return modifyOrderMenu;
    }

    public Order getFoundOrder() {
        return foundOrder;
    }
}



