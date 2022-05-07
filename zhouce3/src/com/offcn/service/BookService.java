package com.offcn.service;

import com.offcn.bean.Book;

import java.util.List;

public interface BookService {
    Book selectById(int id);
    int  updateBook(Book book);
    List<Book> selectAll();
    int deleteBookById(int id);
}
