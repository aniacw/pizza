package main;

import java.util.Date;

public class Message extends SystemComponent {
    private User sender;
    private String message;
    private Date date;

    public Message() {
        this.sender = system.getLoggedUser();
        this.message = null;
        this.date = date;
    }

    @Override
    public String toString() {
        return "main.Message{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
