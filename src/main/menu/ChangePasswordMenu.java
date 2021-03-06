package main.menu;

import main.PizzaSystem;

import java.util.Scanner;

public class ChangePasswordMenu extends Menu {
    public ChangePasswordMenu() {
        super("change password");
    }

    @Override
    public Menu process() {
        System.out.println("Please type your old password:");
        Scanner scanner = new Scanner(System.in);
        String oldPassword = scanner.next();
        System.out.println("Please type new password");
        String newPassword = scanner.next();

        try {
            PizzaSystem.getInstance().getLoggedUser().changePassword(oldPassword, newPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return parent;
    }
}
