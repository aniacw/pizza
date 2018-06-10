package main;

import main.menu.LoginMenu;
import main.menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numStrings = line.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : numStrings)
            numbers.add(Integer.parseInt(s));

    Menu mainMenu = new Menu("Pizza Order System", new LoginMenu());

    }
}
