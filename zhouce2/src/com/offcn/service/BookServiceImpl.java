package com.offcn.service;

import com.offcn.bean.Book;
import com.offcn.dao.BookDao;
import com.offcn.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
          BookDao ii= new BookDaoImpl();
    @Override
    public List<Book> selectBookAll() {
        return  ii.selectBookAll();
    }

    @Override
    public int insertBook(Book book) {
        return ii.insertBook(book);
    }

    @Override
    public Book selectById(int id) {
        return ii.selectById(id);
    }

    @Override
    public int updateBook(Book book) {
        return ii.updateBook(book);
    }

    @Override
    public int deleteById(int id) {
        return ii.deleteById(id);
    }


}
