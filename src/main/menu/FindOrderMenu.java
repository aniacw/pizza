package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class FindOrderMenu extends Menu {
    public FindOrderMenu() {
        super("find order");
    }

    public Order foundOrder;

    @Override
    public Menu process() {
        try {
            System.out.println("Please type order id to change");
            Scanner in = new Scanner(System.in);
            int orderIdToModify = in.nextInt();
            foundOrder = system.getDataBase().findOrderById(orderIdToModify);

        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }

    public Order getFoundOrder() {
        return foundOrder;
    }
}
//    Z tym static w ModfiyOrder to nie jest dobry pomysł, spróbuj zrobić
//        tak, żeby znajdowane było zamówienie, a potem przekazywane do
//        kolejnego menu. Mniej wiecej tak bym proponował: FindOrderMenu robi to
//        co aktualnie ModifyOrder i zawiera ModifyOrderMenu, któremu jest
//        ustawiane znalezione zamóweienie i które jest zwracane z process.
//        ModifyOrderMenu może działać jak zwykłe menu wybierania opcji tylko
//        mieć referencję na pizzę którą aktualnie wybraliśmy.


