package com.offcn.test;

import com.offcn.bean.Student;
import com.offcn.dao.StudentDao;
import com.offcn.impl.StudentDaoImpl;

import javax.jnlp.ClipboardService;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class test1 {
  public  static   StudentDao ss=new StudentDaoImpl();
  public  static SimpleDateFormat si=new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws ParseException {
              //insertStudent1();//添加
                //selectStudent1();//查询全部
                selectStudentId1();//根据ID查询
              //selectStudentName();
                    //updateStudentId();
                        //ss.deleteStudentAll();
    }
    public  static  void insertStudent1 () throws ParseException {//添加
        Student stu=new Student("刘奇才",18,  si.parse("2003-02-02"));
        int i = ss.insertStudent(stu);
        if (i!=0){
            System.out.println("添加成功了");
        }
    }
        public static void selectStudent1(){//查询全部
            List<Student> students = ss.selectStudent();
            System.out.println(students);
        }

        public  static  void selectStudentId1(){//根据id查询
            System.out.println(ss.selectStudentId(4));

        }
        public  static  void selectStudentName(){//根据姓名模糊查询
            List<Student>  list = ss.seclectStudentName("才");
            System.out.println(list);
        }
        public  static void updateStudentId() throws ParseException {//根据id修改
        Student stu =new Student("哈哈哈",21,si.parse("2132-12-2"));
            ss.updateStudentId(3,stu);
        }


}
