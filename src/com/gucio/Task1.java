package com.gucio;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<User> usersList = new ArrayList<>();

        usersList.add(new User("Jan", "Kowalski", 20, false));
        usersList.add(new User("Anna", "Nowak", 30, true));
        usersList.add(new User("Ela", "Fuks", 30, true));


        for (User u:
             usersList) {
            if (u.isFemale()){
                System.out.println(u.getName()+ " "+ u.getSurname());
            }
        }
    }
}
