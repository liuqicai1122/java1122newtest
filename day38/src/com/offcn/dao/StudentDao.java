package com.offcn.dao;

import com.offcn.bean.Student;

import java.util.List;

public interface StudentDao {
    //增加一条记录操作
    int insertStudent(Student stu);
    //查询全部
    List<Student> selectStudent();
    //根据id查询
       Student selectStudentId(int id);
       //根据名字内容查询
    List<Student> seclectStudentName(String name);

    //删除操作所有
    int deleteStudentAll();
    //修改根据id
    void updateStudentId(int id,Student stu);

}
