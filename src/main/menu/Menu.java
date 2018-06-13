package main.menu;

import main.PizzaSystem;
import main.SystemComponent;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends SystemComponent {

    protected Menu parent;
    protected String name;
    private ArrayList<Menu> submenu;

    public Menu(String name, Menu... submenu) {
        this.name = name;
        this.parent = null;
        this.submenu = new ArrayList<>();
        for (Menu menu : submenu)
            addSubmenu(menu);
    }

    public void addSubmenu(Menu menu) {
        submenu.add(menu);
        menu.parent = this;
    }

    public void displayMenu() {
        int menuNumber = 1;
        for (Menu menu : submenu) {
            System.out.println(menuNumber + ". " + menu.name);
            menuNumber++;
        }
        System.out.println("O. BACK");
    }

    public Menu process() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        if (selectedMenu == 0)
            return parent;
        if (selectedMenu - 1 < submenu.size())
            return submenu.get(selectedMenu - 1);
        else
            return null;
    }

    public final void run() {
        Menu current = this;
        while (current != null)
            current = current.process();
    }

    @Override
    public void setSystem(PizzaSystem system) {
        super.setSystem(system);
        for (Menu m : submenu)
            m.setSystem(system);
    }
}

