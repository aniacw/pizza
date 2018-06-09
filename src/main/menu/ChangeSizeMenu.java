package main.menu;

import java.util.Scanner;

public class ChangeSizeMenu extends ModifyOrderMenu {

    public ChangeSizeMenu() {
        super("change size");
    }

    @Override
    public Menu process() {
        System.out.println("Please type new size: 'small', medium' or 'large'");
        Scanner scanner = new Scanner(System.in);
        String newSize = scanner.next();
        System.out.println("your order - select item to edit:" + foundOrder);
        int pizzaNo = scanner.nextInt();
        foundOrder.getPizza().get(pizzaNo-1).setSize(newSize);
        return parent;
    }
}
