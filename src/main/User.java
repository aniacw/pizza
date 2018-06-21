package main;

import main.menu.*;

import java.util.ArrayList;
import java.util.List;

public class User  {
    private String fullName;
    private String login;
    private String password;
    private List<Message> messages;
    protected Menu menu;

    private User() {
    }

    private User(String login, String password, Menu menu) {
        this.fullName = null;
        this.login = login;
        this.password = password;
        this.menu = menu;
        this.messages = new ArrayList<>();
    }

    private static final Menu ADMIN_MENU =
            new Menu("admin menu",
                    new RemoveUserMenu(),
                    new ModifyUderMenu(),
                    new SendMessageMenu(),
                    new ChangeUserAccessMenu(),
                    new CreateAccountMenu(),
                    new ExecuteOrderMenu(),
                    new ChangePasswordMenu(),
                    new CancelOrderMenu(),
                    new ChangeSizeMenu(),
                    new CheckOrders(),
                    new EditContactDataMenu(),
                    new PizzaSelectionMenu(),
                    new PizzaCreatorMenu(),
                    new DisplayMessageMenu(),
                    new FindOrderMenu()
            );

    private static final Menu CUSTOMER_MENU =
            new Menu("customer menu",
                    new SendMessageMenu(),
                    new CancelOrderMenu(),
                    new EditContactDataMenu(),
                    new ChangePasswordMenu(),
                    new PizzaCreatorMenu(),
                    new PizzaSelectionMenu(),
                    new DisplayMessageMenu(),
                    new FindOrderMenu()
            );

    private static final Menu EMPLOYEE_MENU =
            new Menu("employee menu",
                    new SendMessageMenu(),
                    new CheckOrders(),
                    new ChangePasswordMenu(),
                    new EditContactDataMenu(),
                    new DisplayMessageMenu(),
                    new PizzaCreatorMenu(),
                    new PizzaSelectionMenu(),
                    new FindOrderMenu()
            );

    public static User createAdmin(String login, String password) {
        return new User(login, password, ADMIN_MENU);
    }

    public void setAdminRights() {
        menu = ADMIN_MENU;
    }

    boolean hasAdminRights() {
        return menu == ADMIN_MENU;
    }

    public static User createCustomer(String login, String password) {
        return new User(login, password, CUSTOMER_MENU);
    }

    public static User createEmployee(String login, String password) {
        return new User(login, password, EMPLOYEE_MENU);
    }

    public String getLogin() {
        return login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void changePassword(String oldPassword, String newPassword) throws Exception {
        if (verifyPassword(oldPassword))
            password = newPassword;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void addMessage(Message m) {
        messages.add(m);
    }

    public void printMessages(){
        System.out.println(this.messages);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void showInterface(){
        menu.run();
    }
}
