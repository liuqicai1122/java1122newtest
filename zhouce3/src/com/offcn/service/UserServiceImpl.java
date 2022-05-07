package com.offcn.service;

import com.offcn.bean.User;
import com.offcn.dao.UserDao;
import com.offcn.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
      UserDao user=new UserDaoImpl();
    @Override
    public User LoginByUserNameAndPassWord(String username, String password) {
        return user.LoginByUserNameAndPassWord(username,password);
    }
}
