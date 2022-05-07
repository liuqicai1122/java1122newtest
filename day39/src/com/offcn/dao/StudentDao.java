package com.offcn.dao;

import com.offcn.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    int insertStudent(Student stu);//添加记录
     int deleteStudentById(int id) ;//根据ID删除记录
      int updateStudentById(Student stu);//根据ID修改记录
     List<Student> selectAll();//查询所有
    public   Student selectStudentById(int id);//根据ID查询
    public    List<Student> selectStudentByName(String str);//根据名字模糊查询
    public   Long selectCount();//查询条数
}

