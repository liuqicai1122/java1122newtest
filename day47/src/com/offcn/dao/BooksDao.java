package com.offcn.dao;

import com.offcn.bean.Books;
import com.offcn.bean.Page;

import java.util.List;

public interface BooksDao {
    //添加
    int insertBooks(Books books);
    //查询全部书籍
    List<Books>  selectBooks(Page page);
    //删除根据ID
    int deleteById(int id);
    //模糊查询书籍
    List<Books> findBookByCondition(Books books);
    //通过id查询
    Books selectById(int id);
    //根据id修改
    int updateBooks(Books books);
    public int findCount();
}
