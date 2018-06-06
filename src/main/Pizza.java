package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza extends SystemComponent {
    private String name;
    private List<String> toppings;
    private String size;
    private boolean splitHalf;
    private boolean takeAway;
    private float price;

    private static HashMap<String, Pizza>

    public Pizza(List<String> toppings, String size) {
        this.toppings = new ArrayList<>();
        this.size = size;
        this.splitHalf = false;
        this.takeAway = false;
    }

    public String getName() {
        return name;
    }

    public void selectToppings(){

    }

    public List<String> getToppings() {
        return toppings;
    }
}
