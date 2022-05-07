package com.offcn.dao;

import com.offcn.bean.User;

public interface UserDao {
    User selectByUserNameAndPassword(String username,String password);
}
