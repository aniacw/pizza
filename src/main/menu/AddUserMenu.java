package main.menu;

import main.User;

import java.util.Scanner;

public class AddUserMenu extends Menu {
    public AddUserMenu() {
        super("add user");
    }

    @Override
    public Menu process() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type the new login");
        String newLogin = in.next();
        System.out.println("Please set the password");
        String newPassword = in.next();
        User newUser = new User(newLogin, newPassword);
        system.addUser(newUser);
        return parent;
    }
}
