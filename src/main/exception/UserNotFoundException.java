package main.exception;

public class UserNotFoundException extends Exception
{
    public UserNotFoundException() {
    }

    public UserNotFoundException(String login) {
        super("main.User '" + login + "' not found");
    }
}
