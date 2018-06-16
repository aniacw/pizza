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

    // private static HashMap<String, Pizza>

    public Pizza() {
        this.size = size;
        this.splitHalf = splitHalf;
        this.takeAway = takeAway;
        this.price = price;
    }

    public Pizza(List<String> toppings, String size) {
        this.toppings = new ArrayList<>();
        this.size = size;
        this.splitHalf = false;
        this.takeAway = false;
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void removeTopping(String t){
        for (String top : toppings)
            if (top.equals(t))
                toppings.remove(top);
    }
}
