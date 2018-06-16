package main.menu;

import java.util.Scanner;

public class EditContactDataMenu extends Menu {
    public EditContactDataMenu(){
        super("edit contact data");
    }

    @Override
    public Menu process(){
        System.out.println("Please type new full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        system.getLoggedUser().setFullName(name);
        return parent;
    }
}
