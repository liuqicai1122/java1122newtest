package com.offcn.dao;

import com.offcn.bean.Book;

import java.util.List;

public interface BookDao {
    //查询所有图书
     List<Book> selectBookAll();
     //添加图书
     int insertBook(Book book);
     //根据id查询
    Book selectById(int id);
    //更i新修改
    int updateBook(Book book);
    //根据id删除
    int deleteById(int id);



}
