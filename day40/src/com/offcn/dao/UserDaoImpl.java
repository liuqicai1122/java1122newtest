package com.offcn.dao;

import com.offcn.bean.User;
import com.offcn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl  implements UserDao{
//注册
    @Override
    public int insertUser(User user) {
        int result=0;
        QueryRunner qr= new QueryRunner(DataSourceUtils.getDataSource());
        String sql="insert into user value(null,?,?,?,?,?)";
        try {
            result = qr.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getTelephone(),
                    user.getBirthday());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public User checkUsername(String str) {
        User user=null;
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql="select * from user where username=?";
        try {
            user= queryRunner.query(sql, new BeanHandler<>(User.class), str);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
