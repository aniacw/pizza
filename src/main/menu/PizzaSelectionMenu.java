package main.menu;

import main.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSelectionMenu extends Menu {
    private PizzaCreatorMenu pizzaCreator;
    private ArrayList<Pizza> pizzas;

    public PizzaSelectionMenu() {
        super("Order pizza");
        pizzaCreator = new PizzaCreatorMenu();
        pizzas = new ArrayList<>();
    }

    public PizzaSelectionMenu(String name) {
        super(name);
        pizzaCreator = new PizzaCreatorMenu();
        pizzas = new ArrayList<>();
    }

    @Override
    public void displayMenu() {
        int pizzaNumber = 1;
        for (Pizza p : pizzas) {
            System.out.println(pizzaNumber + ". " + p.getName());
            pizzaNumber++;
        }
        System.out.println(pizzaNumber + ". " + pizzaCreator.name);
        System.out.println("O. BACK");
    }

    @Override
    public Menu process() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        if (selectedMenu == 0)
            return parent;
        if (selectedMenu == pizzas.size() + 1)
            return pizzaCreator;
        if (selectedMenu - 1 < pizzas.size()){
            //zamwienie pizzy czyli przypisanie Orderu do usera...
        }
        else
            return null;
    }
}
