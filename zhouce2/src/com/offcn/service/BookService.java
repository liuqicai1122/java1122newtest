package com.offcn.service;

import com.offcn.bean.Book;

import java.util.List;

public interface BookService {
    //查询所有图书
    List<Book> selectBookAll();
    //添加图书
    int insertBook(Book book);
    //根据id查询
    Book selectById(int id);
    //修改 根据id
    int updateBook(Book book);
    int deleteById(int id);

}
