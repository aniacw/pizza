package main;

import main.exception.UserNotFoundException;
import main.menu.Menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.logging.*;

public class PizzaSystem {
    private User loggedUser;
    private List<User> users;
    private Menu menu;
    private DataBase dataBase;
    private SystemLogger logger;

    public PizzaSystem() {
        this.dataBase = new DataBase();
        this.loggedUser = null;
        this.users = new ArrayList<>();
        dataBase.setSystem(this);
        this.logger = new SystemLogger("pizzasystem.log", true);
    }

    public SystemLogger getLogger() {
        return logger;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public User findUserByLogin(String login) throws UserNotFoundException {
        for (User u : users)
            if (u.getLogin().equals(login))
            return u;
        throw new UserNotFoundException(login);
    }

    public List<User> getUsers() {
        return users;
    }

    public User logIn(String login, String password) {
        for (User u : users) {
            if (u.getLogin().equals(login) && u.verifyPassword(password)) {
                System.out.println("user logged in");
                loggedUser = u;
                return u;
            }
        }
        return null;
    }

    public void logOut() { //to dalam na poczatku w User
        System.out.println("user logged out");
    }

    public void addUser(User user) {
        users.add(user);
        user.setSystem(this);
    }

    public void removeUser(User user) throws UserNotFoundException {
        if (!users.remove(user))
            throw new UserNotFoundException(user.getLogin());
    }


    public void removeUserByLogin(String login) throws UserNotFoundException{
        if (!users.removeIf(u->u.getLogin().equals(login)))
            throw new UserNotFoundException(login);
    }

    public void setMainMenu(Menu mainMenu){
        this.menu = mainMenu;
        mainMenu.setSystem(this);
    }

    public void run(){
        menu.run();
    }
}
