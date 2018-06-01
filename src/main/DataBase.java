package main;

import main.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SystemComponent{
    private List<User> users;
    private List<Customer> customers;
    private List<Admin> admins;
    private List<Employee> employees;

    public DataBase() {
        this.users = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public User findUserByLogin(String login) throws UserNotFoundException{

    }




}
