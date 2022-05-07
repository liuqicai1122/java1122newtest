package com.offcn.service;

import com.offcn.bean.User;

import java.util.List;

public interface UserService {
        List<User> selectUserAll();
        int shanchuAll();
        User selectUserById(int id);
        int updateUser(User user);
        int deleteUserById(int id);
        User loginSelectByUsernameAndPassword(String username,String password);
        int insertUser(User user);

}
