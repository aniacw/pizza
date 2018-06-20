package main.menu;

import main.Order;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class CheckOrdersByDate extends CheckOrders {
    public CheckOrdersByDate() {
        super("check orders by date");
    }

    private Date readDate(Scanner scanner){
        Date date = null;
        while (date == null){
            try {
                System.out.println("Please type the date");
                date = Order.dateFormat.parse(scanner.next());
            } catch (ParseException e) {
                date = null;
                System.out.println("Invalid date format");
            }
        }
        return date;
    }

    @Override
    public Menu process(){
        System.out.println("Please type the date");
        Scanner scanner = new Scanner(System.in);
        Date date = readDate(scanner);
       // system.getDataBase().findOrderByDate(date);
        return parent;
    }
}
