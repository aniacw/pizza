package main.menu;

import main.exception.UserNotFoundException;
import main.Message;
import main.User;

import java.util.Scanner;

public class SendMessageMenu extends Menu {

    public SendMessageMenu() {
        super("Send message");
    }

    @Override
    public Menu process() {
        try {
            System.out.println("Please type the receiver's login");
            Scanner scanner = new Scanner(System.in);
            String login = scanner.next();
            User user = system.findUserByLogin(login);
            user.addMessage(new Message());
            return parent;
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return parent;
    }
}
