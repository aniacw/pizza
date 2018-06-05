package main.menu;

import main.exception.UserNotFoundException;

import java.util.Scanner;

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
            system.removeUser(system.findUserByLogin(loginToRemove));
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
