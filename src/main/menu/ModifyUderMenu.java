package main.menu;

import main.PizzaSystem;
import main.exception.UserNotFoundException;

import java.util.Scanner;

public class ModifyUderMenu extends Menu {

    public ModifyUderMenu(){
        super("modify user");
    }

    @Override
    public Menu process(){
        try {
            System.out.println("Please type user login");
            Scanner s = new Scanner(System.in);
            String login = s.next();
            System.out.println("Please type new full name");
            String newFullName = s.next();
            PizzaSystem.getInstance().findUserByLogin(login).setFullName(newFullName);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
