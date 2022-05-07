package com.offcn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Text_模糊查询 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要查询的名字中的一个字");
        String name = sc.nextLine();
        Connection con =null;
        PreparedStatement pre =null;
                ResultSet re = null;
        try {
           con = JDBCUtil.getConnection();
            String str = "select * from student  where name like ?";
           pre = con.prepareStatement(str);
            pre.setString(1,"%"+name+"%");
             re = pre.executeQuery();
             while (re.next()){
                 System.out.println(re.getInt("id")+re.getString("name")+re.getInt("age")+re.getDate("birthday"));
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con,pre,re);
        }
    }
}
