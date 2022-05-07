package com.offcn.dao;

import com.offcn.bean.Page;
import com.offcn.bean.Student;
import org.omg.CORBA.INTERNAL;

import java.awt.print.Book;
import java.util.List;

public interface StudentDao {
    //添加学生
    int insertStudent(Student student);
    //查询全部
    List<Student> selectAllStudent(Page page);
    //根据id删除
    int deleteStudentById(int id);
    //根据id查询
    Student selectStudentById(int id);
    //修改
    int updateStudent(Student student);
    //根据条件查询
    List<Student> selectByCondition(Student student);
        //查找所有条数
    int finCount();



}
