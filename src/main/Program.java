package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numStrings = line.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : numStrings)
            numbers.add(Integer.parseInt(s));

    }
}
