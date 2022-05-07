package com.offcn.impl;

import com.offcn.bean.Account;
import com.offcn.dao.AccountDao;
import com.offcn.util.JDBCUtil2;
import com.offcn.util.JDBCUtil3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {

    @Override//转账
    public void updateMoney( Account a) {
        Connection conn =null;
                PreparedStatement pre =null;
        try {
            conn = JDBCUtil3.getConnection();
            String sql="update account set money =money - ? where id = ?";
            pre = conn.prepareStatement(sql);
            pre.setObject(1,a.getMoney());
            pre.setObject(2,a.getId());
            int i = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil3.close(conn,pre);
        }
    }
}
