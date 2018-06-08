package main.menu;

import main.Order;

public class RemoveToppingMenu extends ModifyOrderMenu {
    public RemoveToppingMenu(){
        super("remove topping");
    }

    @Override
    public Menu process(){
        System.out.println("Here is your order: " + foundOrder);
        System.out.println("Type what you'd like to remove");
        for (Order o : foundOrder)

        return parent;
    }
}
