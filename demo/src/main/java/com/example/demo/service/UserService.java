package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers()throws Exception;

    public User getUserById(int id) throws Exception;

    public User getUser(String keyword) throws Exception;

    public void addUser(User user) throws Exception;

    public void delUser(int id) throws Exception;

    public void updateUser(User user) throws Exception;

}
