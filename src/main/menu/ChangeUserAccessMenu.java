package main.menu;

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
            User userToChange = system.findUserByLogin(in.next());
            userToChange.setAdminRights();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
