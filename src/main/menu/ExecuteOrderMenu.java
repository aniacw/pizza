package main.menu;

import main.Order;

public class ExecuteOrderMenu extends Menu {

    public ExecuteOrderMenu() {
        super("execute order");
    }

    @Override
    public Menu process() {
        for (Order current : system.getDataBase().getOrders()) {
            if (system.getDataBase().g)
        }

        return parent;
    }
}
