package com.offcn.test;

import com.offcn.bean.Account;
import com.offcn.service.AccountServiceImpl;

public class Test_转账 {
    public static void main(String[] args) {
        Account a1=new Account(1,5555);
        Account a2=new Account(2,-5555);
        AccountServiceImpl s=new AccountServiceImpl();
            s.zq(a2,a1);
    }
}
