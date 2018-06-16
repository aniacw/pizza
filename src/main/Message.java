package main;

import java.util.Date;

public class Message extends SystemComponent {
    private User sender;
    private String message;
    private Date date;

    public Message(String message) {
        this.sender = system.getLoggedUser();
        this.message = message;
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
