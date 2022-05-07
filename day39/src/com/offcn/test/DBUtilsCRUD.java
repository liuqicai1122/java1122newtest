package com.offcn.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.impl.DefaultConnectionTester;
import com.offcn.bean.Student;
import com.offcn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DBUtilsCRUD {
    public static void main(String[] args) throws ParseException, SQLException {
        SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd");
        //Student stu=new Student("刘奇才",21,si.parse("2121-2-2"));
          //添加 // insertStudent(stu);
        //int i = deleteStudentById(12);  删除根据ID
        //Student stu=new Student(11,"大魔王",32,si.parse("2132-2-2"));
      // updateStudentById(stu);
        // 查询全部
        //System.out.println(selectAll());
        //根据id查询
        //System.out.println(selectStudentById(6));
        //根据姓名模糊查询
        //System.out.println(selectStudentByName("w"));
        //查询总条数
        System.out.println(selectCount());

    }
    //添加记录
    public  static  int  insertStudent(Student stu) {
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
    //根据id删除
    public  static  int deleteStudentById(int id) throws SQLException {
        int result=0;
        QueryRunner qu = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="delete from student where id=?";
       result= qu.update(sql,id);
        return  result;
    }
    //通过id修改
    public  static  int updateStudentById(Student stu) throws SQLException {
        int result;
        QueryRunner que = new QueryRunner(DataSourceUtils.getDataSoures());
        String sql="update student set name=?,age=?,birthday=? where id=?";
        result = que.update(sql, new Object[]{stu.getName(), stu.getAge(), stu.getBirthday(), stu.getId()});
        return  result;
    }
    //查询全部
    public  static List<Student> selectAll() throws SQLException {
        List<Student> list=new ArrayList<>();
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSoures());
            String sql="select * from student";
        list = qr.query(sql, new BeanListHandler<>(Student.class));
        return  list;
    }
    //根据ID查询
    public  static  Student selectStudentById(int id){
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
    //根据ID模糊查询
    public  static  List<Student> selectStudentByName(String str){
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
    //查询条数
    public  static  Long selectCount(){
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
