package com.offcn.dao;

import com.offcn.bean.User;
import com.offcn.jbutils.DataUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public User selectByUserNameAndPassword(String username, String password) {
        User user=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from user where username=? and password=?";
        try {
            user = queryRunner.query(sql, new BeanHandler<>(User.class), username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
