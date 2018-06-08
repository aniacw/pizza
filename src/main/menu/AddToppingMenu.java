package main.menu;

import java.util.Scanner;

public class AddToppingMenu extends ModifyOrderMenu {
    public AddToppingMenu() {
        super("add topping");
    }

    @Override
    public Menu process() {
        System.out.println("Please select toppings to be added");
        Scanner scanner = new Scanner(System.in);
            int toAdd = scanner.nextInt();
            foundOrder.editPizza(toAdd);
        return parent;
    }
}
