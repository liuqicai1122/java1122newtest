package com.offcn.impl;

import com.offcn.bean.Student;
import com.offcn.dao.StudentDao;
import com.offcn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao {
    @Override//添加记录
    public int insertStudent(Student stu) {
        int update = 0;
        QueryRunner qu = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="insert into student values(null,?,?,?)";

        try {
            update = qu.update(sql,new Object[] {stu.getName(), stu.getAge(), stu.getBirthday()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override//根据ID删除
    public int deleteStudentById(int id) {
        int result=0;
        QueryRunner qu = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="delete from student where id=?";
        try {
            result= qu.update(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  result;
    }

    @Override//通过ID修改
    public int updateStudentById(Student stu) {
        int result = 0;
        QueryRunner que = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="update student set name=?,age=?,birthday=? where id=?";
        try {
            result = que.update(sql, new Object[]{stu.getName(), stu.getAge(), stu.getBirthday(), stu.getId()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  result;
    }

    @Override//查询全部
    public List<Student> selectAll() {
        List<Student> list=new ArrayList<>();
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="select * from student";
        try {
            list = qr.query(sql, new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }

    @Override//通过ID查找
    public Student selectStudentById(int id) {
        Student stu =null;
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="select * from student where id = ?";
        try {
            stu = qr.query(sql, new BeanHandler<>(Student.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }

    @Override//通过名字模糊查询
    public List<Student> selectStudentByName(String str) {
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSoures());
        List<Student> list =new ArrayList<>();
        String sql="select * from student where name like ?";
        try {
            list = qr.query(sql, new BeanListHandler<>(Student.class), "%" + str + "%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override//查找总条数
    public Long selectCount() {
        Long count = 0L;
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="select count(*) from student";
        try {
            count = qr.query(sql, new ScalarHandler<>());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}

