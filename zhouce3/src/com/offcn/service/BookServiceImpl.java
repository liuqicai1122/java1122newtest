package com.offcn.service;

import com.offcn.bean.Book;
import com.offcn.dao.BookDao;
import com.offcn.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl  implements BookService{
    BookDao iii=new BookDaoImpl();
    @Override
    public Book selectById(int id) {
        return iii.selectById(id);
    }

    @Override
    public int updateBook(Book book) {
        return iii.updateBook(book) ;
    }

    @Override
    public List<Book> selectAll() {
        return iii.selectAll();
    }

    @Override
    public int deleteBookById(int id) {
        return iii.deleteBookById(id);
    }
}
