package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> getUsers()throws Exception;

    public User getUserById(int id) throws Exception;

    public User getUser(String keyword) throws Exception;

    public void addUser(User user) throws Exception;

    public void delUser(int id) throws Exception;

    public void updateUser(User user) throws Exception;

}
