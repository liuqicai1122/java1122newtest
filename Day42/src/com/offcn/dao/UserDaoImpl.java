package com.offcn.dao;

import com.offcn.JButils.DataUtils;
import com.offcn.bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Queue;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> SelectUserAll() {
        List<User> list = null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql = "select * from user ";
        try {
            list = queryRunner.query(sql, new BeanListHandler<>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }

    @Override
    public int shanchuAll() {
        int update = 0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql = "delete from user";
        try {
            update = queryRunner.update(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return update;
    }

    @Override
    public User selectUserById(int id) {
        User user = null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql = "select *from user where id=?";
        try {
            user= queryRunner.query(sql, new BeanHandler<>(User.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  user;
    }

    @Override
    public int updateUser(User user) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="update user set username=?,password=?,name=?,telephone=?,birthday=? where id=?";
        try {
            i  = queryRunner.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getTelephone(), user.getBirthday(), user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return i;
    }

    @Override
    public int deleteUserById(int id) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="delete from user where id=?";
        try {
            i = queryRunner.update(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return i;
    }

    @Override
    public User loginSelectByUsernameAndPassword(String username,String password) {
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

    @Override
    public int insertUser(User user) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="insert into user value(null,?,?,?,?,?)";
        try {
            i = queryRunner.update(sql, user.getUsername(), user.getPassword(), user.getName(), user.getTelephone(), user.getBirthday());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return i;
    }
}