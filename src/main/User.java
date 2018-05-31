package main;

import java.util.List;

public class User {
    private String fullName;
    private String login;
    private String password;
    private List<Message> messages;

    public User(String login, String password) {
        this.fullName = null;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void changePassword(String oldPassword, String newPassword){
        if (verifyPassword(oldPassword))
            password = newPassword;
    }

    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }


    public void displayNotification(){

    }

    public void sendNotification(String otherUserLogin){

    }


    public void addMessage(Message m){
        messages.add(m);
    }
}
