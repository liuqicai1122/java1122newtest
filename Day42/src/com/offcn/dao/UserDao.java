package com.offcn.dao;

import com.offcn.bean.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.List;

public interface UserDao {
    //查询所有
      List<User> SelectUserAll();
      //删除所有
        int  shanchuAll();
        //根据id查询
        User selectUserById(int id);
        //修改数据
        int updateUser(User user);
        //根据id删除
        int deleteUserById(int id);
        //查询登录
     User loginSelectByUsernameAndPassword(String username,String password);
     //添加记录 注册
      int insertUser(User user);
}
