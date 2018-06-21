package main.menu;

import main.PizzaSystem;

public class DisplayMessageMenu extends Menu {

    public DisplayMessageMenu(){
        super("display messages");
    }

    @Override
    public Menu process(){
        PizzaSystem.getInstance().getLoggedUser().printMessages();
        return parent;
    }
}
