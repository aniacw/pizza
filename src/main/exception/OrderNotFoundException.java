package main.exception;

public class OrderNotFoundException extends Exception {

    public OrderNotFoundException() {
    }

    public OrderNotFoundException(int id) {
        super("order no " + id + " not found");
    }
}
