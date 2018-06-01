package main;

import main.menu.*;

public class Admin extends User {

    protected Menu menu;
    private boolean hasAdminRights;

    private static final Menu ADMIN_MENU =
            new Menu("admin menu",
                    new AddRemoveUserMenu(),
                    new ModifyUderMenu(),
                    new SendMessageMenu(),
                    new ChangeUserAccessMenu(),
                    new ModifyUderMenu()

            );

    public Admin(String login, String password) {
        super(login, password);
        this.menu = ADMIN_MENU;
        this.hasAdminRights = true;
    }

}
