package main.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifyOrderMenu extends FindOrderMenu {

    private ArrayList<Menu> submenus;

    public ModifyOrderMenu() {
        super("modify order");
        this.submenus = new ArrayList<>();
    }

    public ModifyOrderMenu(String name) {
        super(name);
        this.submenus = new ArrayList<>();
    }

    public void displayMenu() {
        int menuNumber = 1;
        for (Menu menu : submenus) {
            System.out.println(menuNumber + ". " + menu.name);
            menuNumber++;
        }
        System.out.println("O. BACK");
    }

    @Override
    public Menu process() {
        System.out.println("You're going to modify the following order: " + foundOrder);
        System.out.println("Please select one of the options:");
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 0)
            return parent;
        if (choice - 1 < submenus.size())
            return submenus.get(choice - 1);
        return submenus.get(choice - 1);
    }
}
