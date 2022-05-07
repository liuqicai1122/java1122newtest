package com.offcn.dao;

import com.offcn.bean.User;

public interface UserDao {

    int insertUser(User user);
    //验证username
    User checkUsername(String str);
}
