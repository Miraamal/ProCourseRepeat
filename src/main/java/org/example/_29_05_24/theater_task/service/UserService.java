package org.example._29_05_24.theater_task.service;


import org.example._29_05_24.theater_task.model.user.User;

import java.util.ArrayList;
import java.util.List;


public class UserService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }


    public void addUser(User user){
        for (User exuser : users){
            if (exuser.getName().equals(user.getName())){
                throw new IllegalArgumentException("User with this name exists");
            }
        }
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }


    public User getUserByName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("You should enter your name!");
        }
        if (users.isEmpty()){
            throw new IllegalArgumentException("User list is empty!");
        }
        for (User u : users){
            if (u.getName().equals(name)){
                return u;
            }
        }
        return null;
    }





   // todo sozdat pole dlya xraneniya  userov (List)
    //metodi addUser, removeUser, editUser, getUserByName
}
