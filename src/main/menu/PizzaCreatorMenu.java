package main.menu;

import main.Order;
import main.Pizza;
import main.PizzaSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaCreatorMenu extends Menu {
    public PizzaCreatorMenu() {
        super("Custom pizza");
    }

    public Menu process() {
        System.out.println("list of toppings: " + PizzaSystem.getInstance().getDataBase().getRestaurantMenu().getToppings());
        System.out.println("Type chosen ones:");
        Scanner scanner = new Scanner(System.in);
        String selected = scanner.next();
        List<String> selectedToppings = new ArrayList<>();
        selectedToppings.add(selected);

        System.out.println("Please select size: standard, medium, large");
        String size = scanner.next();
        Pizza pizza = new Pizza("Custom", selectedToppings, size);

        List<Pizza> p = new ArrayList<>();
        p.add(pizza);

        Order order = new Order(p, PizzaSystem.getInstance().getLoggedUser());
        PizzaSystem.getInstance().getDataBase().getOrders().add(order);

        return parent;
    }
}
