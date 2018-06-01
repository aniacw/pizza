package main;

import main.menu.AddRemoveUserMenu;
import main.menu.Menu;
import main.menu.ModifyUderMenu;

public class Admin extends User {

    protected Menu menu;
    private boolean hasAdminRights;

    private static final Menu ADMIN_MENU =
            new Menu("admin menu",
                    new AddRemoveUserMenu(),
                    new ModifyUderMenu()

            );

    public Admin(String login, String password) {
        super(login, password);
        this.menu = ADMIN_MENU;
        this.hasAdminRights = true;
    }




}
