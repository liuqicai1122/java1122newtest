package com.offcn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test_删除操作PrepareStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的id");
        String id = sc.nextLine();
        Connection con= null;
        PreparedStatement pre =null;
        try {
             con= JDBCUtil.getConnection();
            String str ="delete from student where id=?";
             pre = con.prepareStatement(str);
             pre.setString(1,id);
            int i = pre.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(con,pre);
        }
    }
}
