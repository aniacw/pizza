package main.menu;

import java.util.Scanner;

public class AddToppingMenu extends ModifyOrderMenu {

    @Override
    public Menu process(){

        System.out.println("Please select toppings to be added");
        Scanner scanner = new Scanner(System.in);
        String toAdd = scanner.next();
        system.getDataBase().findOrderById().editPizza(toAdd);

        return parent;
    }
}
