package com.offcn.dao;

import com.offcn.bean.Book;

import java.util.List;

public interface BookDao {
    Book selectById(int id);
    int  updateBook(Book book);
    List<Book> selectAll();
    int deleteBookById(int id);
}
