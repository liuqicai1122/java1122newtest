package com.offcn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_用工具2添加 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要添加的名字");
        String name = sc.nextLine();
        System.out.println("请输入要添加的年龄");
        String age = sc.nextLine();
        System.out.println("请输入要添加的生日");
        String birthday = sc.nextLine();
        Connection con =null;
        PreparedStatement pre =null;
        try {
             con = JDBCUtil2.getConnection();
            String sql ="insert into student values(null,?,?,?)";
            //创建 PreparedStatement对象顺便将sql传入
          pre= con.prepareStatement(sql);
            //绑定数据
            pre.setString(1,name);
            pre.setString(2,age);
            pre.setString(3,birthday);
            //执行语句
            int i = pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil2.close(con,pre);
        }

    }
}
