package main.exception;

public class UserNotFoundException extends Exception
{
//    public UserNotFoundException() {
//        super("User not found");
//    }

    public UserNotFoundException(String login) {
        super("main.User '" + login + "' not found");
    }
}
