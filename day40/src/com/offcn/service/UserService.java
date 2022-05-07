package com.offcn.service;

import com.offcn.bean.User;

public interface UserService {

    int insertUser(User user);
    //验证username
    User checkUsername(String str);

}
