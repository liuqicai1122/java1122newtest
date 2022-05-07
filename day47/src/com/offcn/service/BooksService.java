package com.offcn.service;

import com.offcn.bean.Books;
import com.offcn.bean.Page;

import java.util.List;

public interface BooksService {
    //添加
    int insertBooks(Books books);
    //查询全部图书
    List<Books> selectBooks(Page page);
    //根据id删除
    int deleteById(int id);
    //模糊查询书籍
    List<Books> findBookByCondition(Books books);
    //根据id查询
    Books selectById(int id);
    //根据id修改
    int updateBooks(Books books);
    //查找总条数
    int findCount();
}
