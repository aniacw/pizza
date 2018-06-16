package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantMenu extends SystemComponent {

    private ArrayList<Pizza> pizzas;
    private List<String> toppings;
    private String pizzaList;

    public RestaurantMenu() {
        this.pizzas = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.pizzaList = "PizzaList.txt";
    }

    //    public void showPizzas() {
//        try {
//            FileInputStream file = new FileInputStream("PizzaList.txt");
//            Scanner scanner = new Scanner(pizzaList);
//
//            while (scanner.hasNext())
//                System.out.println(scanner.nextLine());
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void write(OutputStream outputStream) throws IOException {
//        ObjectOutputStream out = new ObjectOutputStream(outputStream);
//        for (Pizza p :pizzas)
//            out.writeObject(p);
//    }

    Pizza margherita = new Pizza();
    Pizza carbonara = new Pizza();
    Pizza vegetarian = new Pizza();
    Pizza caprese = new Pizza();
    Pizza pepperoni = new Pizza();

    public List<Pizza> showRestaurantMenu() {
        pizzas.add(margherita);
        pizzas.add(caprese);
        pizzas.add(carbonara);
        pizzas.add(vegetarian);
        pizzas.add(pepperoni);
        return pizzas;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> showToppings() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("beacon");
        toppings.add("mushroom");
        toppings.add("onion");
        toppings.add("sweetcorn");
        toppings.add("red pepper");
        toppings.add("chicken");
        toppings.add("olives");
        toppings.add("ham");
        toppings.add("pepperoni");
        return toppings;
    }
}
