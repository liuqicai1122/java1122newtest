package com.offcn.dao;

import com.offcn.bean.User;

public interface UserDao {
    User LoginByUserNameAndPassWord(String username, String password);
}
