package com.offcn.dao;

import com.offcn.bean.Account;

public interface AccountDao {
    //转账
     void updateMoney(Account a);
}
