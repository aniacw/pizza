package main.menu;

import main.PizzaSystem;
import main.exception.UserNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;

public class RemoveUserMenu extends Menu {

    public RemoveUserMenu(){
        super("remove user");
    }

    @Override
    public Menu process(){
        try {
            System.out.println("Please type the login to be removed");
            Scanner in = new Scanner(System.in);
            String loginToRemove = in.next();
            PizzaSystem.getInstance().removeUserByLogin(loginToRemove);
            System.out.println("User '" + loginToRemove +"' removed");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
            PizzaSystem.getInstance().getLogger().log(Level.INFO, e.getMessage());
        }
        return parent;
    }
}
