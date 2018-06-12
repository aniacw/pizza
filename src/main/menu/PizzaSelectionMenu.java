package main.menu;

import main.Order;
import main.Pizza;

import java.util.ArrayList;
import java.util.List;
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
        if (selectedMenu - 1 < pizzas.size()) {
            List<Pizza> currentOrder = new ArrayList<>();
            currentOrder.add(pizzas.get(selectedMenu));
            Order o = new Order(currentOrder, system.getLoggedUser());
            System.out.println("Would you like to order another one? Type '1' for yes or '2' for no");
            if (selectedMenu == 1) {
                displayMenu();
                if (selectedMenu == 0)
                    return parent;
                if (selectedMenu == pizzas.size() + 1)
                    return pizzaCreator;
                if (selectedMenu - 1 < pizzas.size()) {
                    o.addPizza(pizzas.get(selectedMenu));
                }
                return parent;
            }
            if (selectedMenu == 2)
                return parent;
        }

        return parent;
    }
}
//   W PizzaSelectionMenu chodzi o to musi być return zarówno po ifie jak
//        po else. wewenatrz ifa nie zawsze wychodzimy z funkcji poprawnie więc
//        zaczęło działać kiedy dorzuciłaś return na samym koncu który wywoła
//        się jeśli nie wyszliśmy gdziekolwiek wcześniej. Ale poza tym nulla
//        mieliśmy nie zwracać bo null ma w założeniu wychodzić z programu
