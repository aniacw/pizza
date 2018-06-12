package main.menu;

import main.Order;
import main.exception.OrderNotFoundException;

import java.util.Scanner;

public class ModifyOrderMenu extends Menu {
    public ModifyOrderMenu() {
        super("modify order");
    }

    public ModifyOrderMenu(String name) {
        super(name);
    }

    @Override
    public Menu process(){

        return parent;
    }

}
//    Z tym static w ModfiyOrder to nie jest dobry pomysł, spróbuj zrobić
//        tak, żeby znajdowane było zamówienie, a potem przekazywane do
//        kolejnego menu. Mniej wiecej tak bym proponował: FindOrderMenu robi to
//        co aktualnie ModifyOrder i zawiera ModifyOrderMenu, któremu jest
//        ustawiane znalezione zamóweienie i które jest zwracane z process.
//        ModifyOrderMenu może działać jak zwykłe menu wybierania opcji tylko
//        mieć referencję na pizzę którą aktualnie wybraliśmy.