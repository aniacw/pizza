//package main.menu;
//
//import main.Order;
//import main.Pizza;
//
//import java.util.Scanner;
//
//public class RemoveToppingMenu extends ModifyOrderMenu {
//    public RemoveToppingMenu(){
//        super("remove topping");
//    }
//
//    @Override
//    public Menu process(){
//        System.out.println("Here is your order: " + foundOrder);
//        System.out.println("select which pizza to edit");
//        Scanner scanner = new Scanner(System.in);
//        Pizza p = foundOrder.getPizza().get(scanner.nextInt()+1);
//        System.out.println("Type what you'd like to remove");
//
//        String toppingToRemove = scanner.next();
//        foundOrder.getPizza().get(scanner.nextInt()+1).
//
//        return parent;
//    }
//}
