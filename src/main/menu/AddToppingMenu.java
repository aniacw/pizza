package main.menu;

import main.Pizza;

import java.util.Scanner;

public class AddToppingMenu extends ModifyOrderMenu {
    public AddToppingMenu() {
        super("add topping");
    }

    @Override
    public Menu process() {
        System.out.println("select which pizza to edit");
        Scanner scanner = new Scanner(System.in);
        Pizza p = foundOrder.getPizza().get(scanner.nextInt() + 1);
        System.out.println("Type what you'd like to add");
        String toppingToAdd = scanner.next();
        p.addTopping(toppingToAdd);
        return parent;
    }
}
