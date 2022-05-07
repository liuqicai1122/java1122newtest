package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl  implements UserService{
    UserDaoImpl i=new UserDaoImpl();
    @Override
    public List<User> selectUserAll() {
        return i.SelectUserAll();
    }

    @Override
    public int shanchuAll() {
        return  i.shanchuAll();
    }

    @Override
    public User selectUserById(int id) {

        return i.selectUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return i.updateUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return i.deleteUserById(id);
    }

    @Override
    public User loginSelectByUsernameAndPassword(String username, String password) {
        return  i.loginSelectByUsernameAndPassword(username,password);
    }

    @Override
    public int insertUser(User user) {
        return i.insertUser(user);
    }


}
