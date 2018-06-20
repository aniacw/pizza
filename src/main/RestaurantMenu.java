package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantMenu extends SystemComponent {

    private ArrayList<Pizza> pizzas;
    private ArrayList<String> toppings;

    private String pizzaList;

    Pizza margherita = new Pizza(Arrays.asList("cheese", "tomato"), "medium");
    Pizza carbonara = new Pizza(Arrays.asList("beacon", "cream", "tomato"), "medium");
    Pizza vegetarian = new Pizza(Arrays.asList("tomato", "sweetcorn", "broccoli"), "medium");
    Pizza caprese = new Pizza(Arrays.asList("mozzarella", "basil", "tomato"), "medium");
    Pizza pepperoni = new Pizza(Arrays.asList("pepperoni", "mushroom", "tomato"), "medium");

    public RestaurantMenu() {
        this.pizzas = new ArrayList<>(Arrays.asList(margherita, caprese, carbonara, vegetarian, pepperoni));
        this.toppings = new ArrayList<>(Arrays.asList("tomato", "mozzarella", "red pepper", "onion", "mushroom",
                "sweetcorn", "chicken", "bacon", "pepperoni", "olives", "salmon", "tuna"));
        this.pizzaList = "PizzaList.txt";
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<String> getToppings() {
        return toppings;
    }

}
