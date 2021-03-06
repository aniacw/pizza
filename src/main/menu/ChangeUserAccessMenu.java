package main.menu;

import main.PizzaSystem;
import main.User;
import main.exception.UserNotFoundException;

import java.util.Scanner;

public class ChangeUserAccessMenu extends Menu {
    public ChangeUserAccessMenu(){
        super("change user access");
    }

    @Override
    public Menu process(){
        System.out.println("Please type login to be changed to admin");
        Scanner in = new Scanner(System.in);
        try {
            User userToChange = PizzaSystem.getInstance().findUserByLogin(in.next());
            userToChange.setAdminRights();
            System.out.println(userToChange + " is now admin");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
