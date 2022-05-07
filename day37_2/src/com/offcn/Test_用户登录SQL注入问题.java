package com.offcn;

import java.sql.*;
import java.util.Scanner;

public class Test_用户登录SQL注入问题 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入登录的用户号");
        String  username = sc.nextLine();
        System.out.println("请输入密码");
        String  password = sc.nextLine();
        Connection con=null;
        PreparedStatement pr= null;
        ResultSet re =null;
        //PreparedStatement好处
        //1 防止SQL攻击
        //2 提高代码可读性 可维护性
        //3提高效率

        try {
            con= JDBCUtil.getConnection();
            //con.setAutoCommit(false);//设置为手动提交
         //1、编写 SQL 语句，未知内容使用?占位："SELECT * FROM user WHERE username=? AND password=?;"
            String str ="select * from user where username =? and password =?";
                //2 获得PrearedStatement对象
            pr= con.prepareStatement(str);
            //由于sql语句中有? 需要传具体参数
            pr.setString(1,username);
            pr.setString(2,password);
            re = pr.executeQuery();//使用preparedStatement执行不需要传入sql 因为创建时候已经传入
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
            JDBCUtil.close(con,pr,re);
        }
    }
}
