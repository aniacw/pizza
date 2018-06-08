package main.menu;

import java.util.Scanner;

public class ChangeSizeMenu extends ModifyOrderMenu{

    public ChangeSizeMenu(){
        super("change size menu");
    }

    @Override
    public Menu process(){
        System.out.println("Please type new size: 'small', medium' or 'large'");
        Scanner scanner = new Scanner(System.in);
        String newSize = scanner.next();
        foundOrder.getPizza().
        return parent;
    }
}
