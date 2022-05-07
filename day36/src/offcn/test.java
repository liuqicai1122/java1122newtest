package offcn;

import java.sql.*;

public class test {
    public static void main(String[] args)  {
        //1 加载驱动

        //2 获取连接
        Connection conn = null;
        Statement statement =null;
        ResultSet rs =null;
        try {
            //1 加载=驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my1?useUnicode=true& " +
                    "characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai","root","root");

        //3获得执行 SQL 语句的对象
     statement = conn.createStatement();
        //4执行SQL
        String sql = "select * from student";
        rs = statement.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getInt("ID") + "\t" + rs.getString("name")
                        + "\t" + rs.getInt("age") + "\t" + rs.getDate("birthday"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //5

        //关流

    }
}
