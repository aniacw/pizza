package main.menu;

public class DisplayMessageMenu extends Menu {

    public DisplayMessageMenu(){
        super("display messages");
    }

    @Override
    public Menu process(){
        system.getLoggedUser().readMessage();
        return parent;
    }
}
