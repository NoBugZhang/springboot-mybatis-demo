package com.example.demo.service.serviceImpl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() throws Exception {
        return userMapper.getUsers();
    }

    @Override
    public User getUserById(int id) throws Exception {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUser(String keyword) throws Exception {
        return userMapper.getUser(keyword);
    }

    @Override
    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }

    @Override
    public void delUser(int id) throws Exception {
        userMapper.delUser(id);
    }

    @Override
    public void updateUser(int id) throws Exception {
        userMapper.updateUser(id);
    }
}
