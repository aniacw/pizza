package main;

import java.util.Date;

public class Message {
    private String sender;
    private String message;
    private Date date;

    @Override
    public String toString() {
        return "main.Message{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
