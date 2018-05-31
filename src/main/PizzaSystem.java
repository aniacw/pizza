package main;

import main.menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class PizzaSystem {
    private User loggedUser;
    private List<User> users;
    private Menu menu;
    private DataBase dataBase;

    public PizzaSystem(){
        this.dataBase = new DataBase();
        this.loggedUser = null;
        this.users = new ArrayList<>();
        dataBase.setSystem(this);
    }

    public void logIn(String login, String password){ //to dalam na poczatku w User
        for (User u : users) {
            if (u.getLogin().equals(login) && u.verifyPassword(password)) {
                System.out.println("user logged in");
            } else {
                System.out.println("incorrect credentials");
            }
        }
    }

    public void logOut(){ //to dalam na poczatku w User
        System.out.println("user logged out");
    }

}
