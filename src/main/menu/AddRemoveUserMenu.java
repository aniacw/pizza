package main.menu;

import main.User;
import main.exception.UserNotFoundException;

import java.util.Scanner;

public class AddRemoveUserMenu extends Menu {
    public AddRemoveUserMenu() {
        super("add/remove user menu");
    }

    @Override
    public Menu process() {
        System.out.println("If you'd like to add user, type 'add'. \n If you'd like to remove user, type 'remove");
        Scanner in = new Scanner(System.in);
        if (in.next().equals("add")) {
            System.out.println("Please type the new login");
            String newLogin = in.next();
            System.out.println("Please set the password");
            String newPassword = in.next();
            User newUser = new User(newLogin, newPassword);
            system.addUser(newUser);
        }

        if (in.next().equals("remove")) {
            try {
                System.out.println("Please type the login to be removed");
                String loginToRemove = in.next();
                system.removeUser(system.getDataBase().findUserByLogin(loginToRemove));
            } catch (UserNotFoundException e) {
                e.printStackTrace();
            }
        }
        return parent;
    }
}
