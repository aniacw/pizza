package main;

import main.menu.*;

import java.util.List;

public class User extends SystemComponent {
    private String fullName;
    private String login;
    private String password;
    private List<Message> messages;
    protected Menu menu;

    public User() {
    }

    private static final Menu ADMIN_MENU =
            new Menu("admin menu",
                    new AddUserMenu(),
                    new RemoveUserMenu(),
                    new ModifyUderMenu(),
                    new SendMessageMenu(),
                    new ChangeUserAccessMenu(),
                    new ModifyUderMenu(),
                    new CreateAccountMenu(),
                    new CreateOrderMenu(),
                    new ExecuteOrderMenu(),
                    new ChangePasswordMenu(),
                    new CancelOrderMenu(),
                    new ChangeSizeMenu(),
                    new CheckOrders(),
                    new EditContactDataMenu(),
                    new PizzaSelectionMenu(),
                    new PizzaCreatorMenu()
            );

    private static final Menu CUSTOMER_MENU =
            new Menu("customer menu",
                    new CreateOrderMenu(),
                    new SendMessageMenu(),
                    new CancelOrderMenu(),
                    new EditContactDataMenu(),
                    new ChangePasswordMenu(),
                    new ChangeSizeMenu(),
                    new ModifyOrderMenu(),
                    new PizzaCreatorMenu(),
                    new PizzaSelectionMenu()
            );

    private static final Menu EMPLOYEE_MENU =
            new Menu("employee menu",
                    new ExecuteOrderMenu(),
                    new SendMessageMenu(),
                    new CheckOrders(),
                    new ChangePasswordMenu(),
                    new CheckOrders(),
                    new CreateOrderMenu(),
                    new EditContactDataMenu(),
                    new ExecuteOrderMenu()
            );

    public User createAdmin(String login, String password) {
        User u = new User(login, password);
        u.setMenu(ADMIN_MENU);
        return u;
    }

    public void setAdminRights() {
        menu = ADMIN_MENU;
    }

    boolean hasAdminRights() {
        return menu == ADMIN_MENU;
    }

    public User createCustomer(String login, String password) {
        User u = new User(login, password);
        u.setMenu(CUSTOMER_MENU);
        return u;
    }

    public User createEmployee(String login, String password) {
        User u = new User(login, password);
        u.setMenu(EMPLOYEE_MENU);
        return u;
    }

    public User(String login, String password) {
        this.fullName = null;
        this.login = login;
        this.password = password;
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

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
