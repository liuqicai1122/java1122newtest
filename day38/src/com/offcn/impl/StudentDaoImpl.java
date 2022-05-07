package com.offcn.impl;

import com.offcn.bean.Student;
import com.offcn.dao.StudentDao;
import com.offcn.util.JDBCUtil;
import com.offcn.util.JDBCUtil2;

import javax.swing.*;
import java.sql.*;
import java.util.*;

public class StudentDaoImpl implements StudentDao {
    //添加一条数据
    @Override
    public int insertStudent(Student stu) {
        Connection con =null;
        PreparedStatement ps= null;
        int i =0;
        try {
           con = JDBCUtil2.getConnection();
            String sql="insert into student values (null,?,?,?)";
             ps = con.prepareStatement(sql);
            ps.setObject(1,stu.getName());
            ps.setObject(2,stu.getAge());
            ps.setObject(3,stu.getBirthday());
            i = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return i;
    }
//查询全部
    @Override
    public List<Student> selectStudent() {
        List<Student> list=new ArrayList<>();
        Connection con =null;
        PreparedStatement pre =null;
        ResultSet re =null;
        try {
            con = JDBCUtil2.getConnection();
            String sql="select * from student";
            pre = con.prepareStatement(sql);
            re = pre.executeQuery();
            while(re.next()){
                Student stu=new Student();
                stu.setId(re.getInt("id"));
                stu.setName(re.getString("name"));
                stu.setAge(re.getInt("age"));
                stu.setBirthday(re.getDate("birthday"));
                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre,re);
        }

        return list;
    }
//根据id查询
    @Override
    public Student selectStudentId(int id) {
        Connection con =null;
        PreparedStatement pre=null;
        ResultSet re =null;
        Student stu=null;
        try {
             con = JDBCUtil2.getConnection();
            String sql ="select * from student where id =?";
            pre= con.prepareStatement(sql);
            pre.setObject(1,id);
             re = pre.executeQuery();
             while (re.next()){
                  stu=new Student();
                 stu.setId(re.getInt("id"));
                 stu.setName(re.getString("name"));
                 stu.setAge(re.getInt("age"));
                 stu.setBirthday(re.getDate("birthday"));
             }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre,re);
        }
        return stu;
    }
//根据名字模糊查询
    @Override
    public List<Student> seclectStudentName(String name) {
        Connection con =null;
        PreparedStatement pre =null;
        ResultSet re =null;
        List<Student>  list=new ArrayList<>();
        try {
           con = JDBCUtil.getConnection();
            String sql="select * from student where name like ?";
            pre = con.prepareStatement(sql);
            pre.setObject(1,"%"+name+"%");
            re = pre.executeQuery();
            while (re.next()){
               Student stu=new Student();
                stu.setId(re.getInt("id"));
                stu.setName(re.getString("name"));
                stu.setAge(re.getInt("age"));
                stu.setBirthday(re.getDate("birthday"));
                list.add(stu);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre,re);
        }
        return list;
    }
        //删除所有
    @Override
    public int deleteStudentAll() {
        Connection con =null;
        PreparedStatement pre =null;
        int i =0;
        try {
            con = JDBCUtil.getConnection();
            String sql="delete from orders";
            pre = con.prepareStatement(sql);
             i = pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre);
        }
        return i;
    }
    //根据id修改
    @Override
    public  void updateStudentId(int id,Student stu){
        Connection con =null;
        PreparedStatement pre =null;
        try {
            con = JDBCUtil.getConnection();
            String sql="update student set name= ?,age=?,birthday=? where id=?";
            pre = con.prepareStatement(sql);
            pre.setObject(1,stu.getName());
            pre.setObject(2,stu.getAge());
            pre.setObject(3,stu.getBirthday());
            pre.setObject(4,id);
            int i = pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre);
        }
    }

    //
}
