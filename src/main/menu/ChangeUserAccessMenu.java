package main.menu;

import java.util.Scanner;

public class ChangeUserAccessMenu extends Menu {
    public ChangeUserAccessMenu(){
        super("change user access");
    }

    @Override
    public Menu process(){
        System.out.println("Please type login to be changed to admin");
        Scanner in = new Scanner(System.in);
        String login = in.next();
        system.getDataBase().findUserByLogin(login).

        return parent;
    }
}
