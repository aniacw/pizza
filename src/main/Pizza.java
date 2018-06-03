package main;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends SystemComponent {

    private List<String> toppings;
    private String size;
    private boolean splitHalf;
    private boolean takeAway;

    public Pizza(List<String> toppings, String size) {
        this.toppings = new ArrayList<>();
        this.size = size;
        this.splitHalf = false;
        this.takeAway = false;
    }

    public void selectToppings(){

    }

}
