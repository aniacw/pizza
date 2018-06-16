package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class FindOrderMenu extends Menu {
    public FindOrderMenu() {
        super("find order");
    }

    protected Order foundOrder;
    public ModifyOrderMenu modifyOrderMenu;

    public FindOrderMenu(String name) {
        super(name);
    }

    @Override
    public Menu process() {
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            foundOrder = system.getDataBase().findOrderById(in.nextInt());

        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return modifyOrderMenu;
    }

    public Order getFoundOrder() {
        return foundOrder;
    }
}
//        znajdowane było zamówienie, a potem przekazywane do
//        kolejnego menu. Mniej wiecej tak bym proponował: FindOrderMenu robi to
//        co aktualnie ModifyOrder i zawiera ModifyOrderMenu, któremu jest
//        ustawiane znalezione zamóweienie i które jest zwracane z process.
//        ModifyOrderMenu może działać jak zwykłe menu wybierania opcji tylko
//        mieć referencję na pizzę którą aktualnie wybraliśmy.


