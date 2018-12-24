package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    @RequestMapping("userList")
    public List<User> index() throws Exception{
        return userService.getUsers();
    }

    @RequestMapping("user")
    public User queryById(int id) throws Exception{
        return userService.getUserById(id);
    }

    @RequestMapping("userLike")
    public User queryByKeyword(String keyword) throws Exception{
        return userService.getUser(keyword);
    }

    @RequestMapping("delete/{id}")
    public String delete(int id) throws Exception{
        userService.delUser(id);
        return "You have deleted the user who's id =" + id;
    }

    @RequestMapping("addUser")
    public String addUser(User user) throws Exception{
        userService.addUser(user);
        return "You just add an user named : " + user.getUserName();
    }

    @RequestMapping("update")
    public String updateUser(User user) throws Exception{
        userService.updateUser(user);
        return "You just update the user named : " + user.getUserName();
    }

}
