package com.offcn.service;

import com.offcn.bean.Account;
import com.offcn.dao.AccountDao;
import com.offcn.impl.AccountDaoImpl;

public class AccountServiceImpl {
           AccountDao aa=new AccountDaoImpl();
        public   void  zq(Account zhuanqian, Account shouqian){
                    aa.updateMoney(zhuanqian);
                    aa.updateMoney(shouqian);
            }

}
