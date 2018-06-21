package main.menu;

import main.PizzaSystem;
import main.exception.UserNotFoundException;
import main.Message;
import main.User;

import java.util.Scanner;

public class SendMessageMenu extends Menu {

    public SendMessageMenu() {
        super("send message");
    }

    @Override
    public Menu process() {
        try {
            System.out.println("Please type the receiver's login");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.next();
            User user = PizzaSystem.getInstance().findUserByLogin(login);
            System.out.println("Please type the message");
            String msg = scanner.next();
            user.addMessage(new Message(msg));
            return parent;
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
