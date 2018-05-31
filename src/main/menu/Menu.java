package main.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    protected Menu parent;
    private String name;
    private ArrayList<Menu> submenu;

    public Menu(String name, Menu... submenu) {
        this.name = name;
        this.parent = null;
        this.submenu = new ArrayList<>();
    }

    public void displayMenu(){
        int menuNumber = 1;
        for (Menu menus : submenu){
            System.out.println(menuNumber + ". " + name);
            menuNumber++;
        }


    }

    public Menu process(){
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        if (selectedMenu == 0)
            return parent;
        if (selectedMenu - 1 <submenu.size())
            return submenu.get(selectedMenu - 1);
        else
            return null;
    }
}
