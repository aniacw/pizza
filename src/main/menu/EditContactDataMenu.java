package main.menu;

import java.util.Scanner;

public class EditContactDataMenu extends Menu {
    public EditContactDataMenu(){
        super("edit contact data menu");
    }

    @Override
    public Menu process(){
        System.out.println("Please type new phone number");
        Scanner scanner = new Scanner(System.in);
        Integer newPhone = scanner.nextInt();
        system.g
    }
}
