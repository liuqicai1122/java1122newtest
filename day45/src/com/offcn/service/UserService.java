package com.offcn.service;

import com.offcn.bean.User;

public interface UserService {
    User selectByUserNameAndPassword(String username, String password);
}
