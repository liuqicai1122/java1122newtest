package com.offcn.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sun.org.apache.bcel.internal.generic.DREM;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil3 {
   static DataSource dataSource =null;
    static {
        Properties pro=new Properties();
        //通过当前类的class对象获取资源文件 返回一个读取资源的流
        InputStream resourceAsStream = JDBCUtil3.class.getResourceAsStream("/druid.properties");
        try {
            //从流中读取属性列表
            pro.load(resourceAsStream);
           dataSource = DruidDataSourceFactory.createDataSource(pro);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  Connection getConnection(){
        Connection con =null;
        try {
            con = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  con;
    }
    //关闭资源的方法
    public static  void close(Connection con, Statement stmt, ResultSet rs){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static  void close(Connection con, Statement stmt) {
        close(con, stmt, null);
    }

}
