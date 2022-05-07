package com.offcn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test_用户登录 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入登录的用户号");
        String  username = sc.nextLine();
        System.out.println("请输入密码");
        String  password = sc.nextLine();
        Connection con=null;
        Statement st =null;
        ResultSet re =null;

        try {
            con= JDBCUtil.getConnection();
            //con.setAutoCommit(false);//设置为手动提交
            st = con.createStatement();
            String str ="select * from user where username ='"+username+"' and PASSWORD ='"+password+"'";
           re = st.executeQuery(str);
              if (re.next()){//查到数据
                  System.out.println("登陆成功");
              }else {
                  System.out.println("登录失败,有错误");
              }
          // con.commit();//正确时候提交
        } catch (SQLException e) {
            e.printStackTrace();
           // try {
             //   con.rollback();//出现异常时候回滚
           // } catch (SQLException ex) {
                //ex.printStackTrace();
            //}
        }finally {
            JDBCUtil.close(con,st,re);
        }
    }
}
