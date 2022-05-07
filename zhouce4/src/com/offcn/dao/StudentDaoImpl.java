package com.offcn.dao;

import com.offcn.bean.Page;
import com.offcn.bean.Student;
import com.offcn.utils.DataUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements  StudentDao{
    @Override
    public int insertStudent(Student student){
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="insert into student value(null,?,?,?)";
        try {
            i = queryRunner.update(sql, student.getName(), student.getAge(), student.getScore());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Student> selectAllStudent(Page page) {
        List<Student> list=new ArrayList<>();
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from student order by score ASC limit ?,?";
        try {
           list = queryRunner.query(sql, new BeanListHandler<>(Student.class),(page.getCurrentPage()-1)*3,page.PAGESIZE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int deleteStudentById(int id) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="delete from student where id=?";
        try {
            i = queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public Student selectStudentById(int id) {
        Student student=new Student();
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql= "select * from student where id=?";
        try {
           student= queryRunner.query(sql, new BeanHandler<>(Student.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public int updateStudent(Student student) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String  sql="update student set name=?,age=?,score=? where id= ?";
        try {
            i = queryRunner.update(sql, student.getName(), student.getAge(), student.getScore(), student.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Student> selectByCondition(Student student) {
        List<Student> list=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
            String sql=getSql(student);
        try {
            list = queryRunner.query(sql, new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int finCount() {
        Long count=0L;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select count(*) from student";
        try {
            count = (Long)queryRunner.query(sql, new ScalarHandler<>());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count.intValue();
    }

    String getSql(Student student){
        StringBuilder sql=new StringBuilder("select * from student where 1=1");
        if (student.getName()!=null && !"".equals(student.getName().trim())){
                sql.append(" and name like '%").append(student.getName()).append("%'");
         if (student.getAge()!=0) {
             sql.append(" and age =").append(student.getAge());
         }
         if (student.getScore()!=0){
             sql.append(" and score =").append(student.getScore());
         }
        }
        return sql.toString();
    }
}
