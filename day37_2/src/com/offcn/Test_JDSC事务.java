package com.offcn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Scanner;

public class Test_JDSC事务 {
    public static void main(String[] args) {
        //键盘录入转账
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要转账的用户id");
        String id1 = sc.nextLine();
        System.out.println("请输入要收账的用户id");
        String id2 = sc.nextLine();
        System.out.println("请输入要转账的金额");
        String money = sc.nextLine();
        //使用工具类 创建连接
        Connection con=null;
        Statement st= null;
        try {
            con= JDBCUtil.getConnection();
            //con.setAutoCommit(false);//关闭自动提交 设置手动提交
          st= con.createStatement();
          String str1="update account set money=money-"+money+" where id="+id1+"";//转账语句

            String str2="update account set money=money+"+money+" where id="+id2+"";//收账语句
            int i1 = st.executeUpdate(str1);//执行转账
            int iiii=2/0;//如果有异常 但是 转账成功 收款失败了 这是不行的
            //为了让多个 SQL 语句作为一个事务执行： 调用 Connection 对象的 setAutoCommit(false); 以取消自动提交事务。。
            // 在所有的 SQL 语句都成功执行后，调用 commit(); 方法提交事务 在出现异常时，调用 rollback(); 方法回滚事务
            int i = st.executeUpdate(str2);//执行收账
            //con.commit();//以上两个都正确时候提交
        } catch (SQLException e) {
            e.printStackTrace();
           // try {
              //  con.rollback();//出现异常时候回滚
           // } catch (SQLException ex) {
                //exprintStackTrace();
            } finally {
            JDBCUtil.close(con,st);
        }
    }
}
