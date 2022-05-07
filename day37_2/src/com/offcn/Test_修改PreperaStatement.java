package com.offcn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_修改PreperaStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的id");
        String id = sc.nextLine();
        System.out.println("请输入要修改的姓名");
        String name = sc.nextLine();

        System.out.println("请输入要修改的年龄");
        String age = sc.nextLine();
        System.out.println("请输入要修改的出生日期");
        String birthday = sc.nextLine();
        Connection con =null;
        PreparedStatement pre=null;
        try {
            con = JDBCUtil.getConnection();//注册 并且获取连接
            //创建SQL语句dwa
            String sql ="update student set name=?,age=?,birthday=? where id=?";
            //创建 PreparedStatement对象顺便将sql传入
            pre= con.prepareStatement(sql);
            //绑定数据
            pre.setString(1,name);
            pre.setString(2,age);
            pre.setString(3,birthday);
            pre.setString(4,id);
            //执行语句
            int i = pre.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(con,pre);
        }



    }
}
