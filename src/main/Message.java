package main;

import java.time.LocalDateTime;
import java.util.Date;

public class Message  {
    private User sender;
    private String message;
    private Date date;

    public Message(String message) {
        this.sender = PizzaSystem.getInstance().getLoggedUser();
        this.message = message;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return  "sender='" + sender.getLogin() + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date;
    }
}
