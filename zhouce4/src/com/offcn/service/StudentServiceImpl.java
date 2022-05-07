package com.offcn.service;

import com.offcn.bean.Page;
import com.offcn.bean.Student;
import com.offcn.dao.StudentDao;
import com.offcn.dao.StudentDaoImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentDao ss=new StudentDaoImpl();
    @Override
    public int insertStudent(Student student) {

        return   ss.insertStudent(student);
    }

    @Override
    public List<Student> selectAllStudent(Page page) {
        return ss.selectAllStudent(page);
    }

    @Override
    public int deleteStudentById(int id) {

        return ss.deleteStudentById(id);
    }

    @Override
    public Student selectStudentById(int id) {
        return ss.selectStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {

        return ss.updateStudent(student);
    }

    @Override
    public List<Student> selectByCondition(Student student) {
        return ss.selectByCondition(student);
    }

    @Override
    public int finCount() {

        return ss.finCount();
    }

}
