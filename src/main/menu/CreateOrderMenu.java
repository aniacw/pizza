//package main.menu;
//
//import main.Order;
//import main.Pizza;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class CreateOrderMenu extends Menu {
//    public CreateOrderMenu(){
//        super("create order");
//    }
//
//    public Menu process(){
//        System.out.println("list of toppings: " + system.getDataBase().getToppings());
//        System.out.println("Type chosen ones:");
//        Scanner scanner = new Scanner(System.in);
//        String selected = scanner.next();
//        List<String> selectedList = new ArrayList<>();
//        selectedList.add(selected);
//
//        System.out.println("Please select size: standard, medium, large");
//        String size = scanner.next();
//        Pizza pizza = new Pizza(selectedList, size);
//        List<Pizza> p = new ArrayList<>();
//        p.add(pizza);
//        Order order = new Order(p, system.getLoggedUser());
//        system.getDataBase().getOrders().add(order);
//
//        return parent;
//    }
//}
