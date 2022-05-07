package com.offcn.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataSourceUtils {

       private static DataSource ds = null;
       public  static  DataSource getDataSource(){
         ds= new ComboPooledDataSource();
return     ds;
       }



       public static  Connection getConnection(){
           Connection con =null;
           try {
               con = ds.getConnection();
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
    public static  void close(Connection con, Statement stmt){
        close(con,stmt,null);
    }
}




