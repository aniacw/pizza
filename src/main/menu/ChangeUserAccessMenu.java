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
        try {
            System.out.println("Please type login to be changed to admin");
            Scanner in = new Scanner(System.in);
            User userToChange = system.getDataBase().findUserByLogin(in.next());
            system.getDataBase().

            return parent;
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
