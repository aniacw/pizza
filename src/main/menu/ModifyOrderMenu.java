package main.menu;

import java.util.Scanner;

public class ModifyOrderMenu extends Menu {
    public ModifyOrderMenu(){
        super("modify order menu");
    }

    @Override
    public Menu process(){
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            int orderId = in.nextInt();
            system.getDataBase().findOrderById(orderId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return parent;
    }
}
