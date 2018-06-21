package main;

import main.menu.DisplayMessageMenu;
import main.menu.LoginMenu;
import main.menu.Menu;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

public class Program {

    //scenebuilder


    public static void main(String[] args) {
        PizzaSystem system = PizzaSystem.getInstance();
        try {
            Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        String[] numStrings = line.split(" ");
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (String s : numStrings)
//            numbers.add(Integer.parseInt(s));

            Menu mainMenu = new Menu("Pizza Order System",
                    new LoginMenu()
            );



            system.setMainMenu(mainMenu);
            system.addUser(User.createAdmin("Clark", "7777"));
            system.addUser(User.createCustomer("rocky", "8888"));
            system.addUser(User.createCustomer("mickey", "9999"));
            system.run();

        }
        catch(Throwable t){
            system.getLogger().log(t);
        }
    }
}
