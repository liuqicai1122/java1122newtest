package com.offcn.service;

import com.offcn.bean.User;

public interface UserService {
    User LoginByUserNameAndPassWord(String username, String password);

}
