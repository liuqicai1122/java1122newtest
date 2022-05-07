package com.offcn.service;

import com.offcn.bean.Books;
import com.offcn.bean.Page;
import com.offcn.dao.BookDaoImpl;
import com.offcn.dao.BooksDao;

import java.util.List;

public class BooksServiceImpl implements BooksService {
     BooksDao ii=new BookDaoImpl();

    @Override
    public int insertBooks(Books books) {

        return ii.insertBooks(books);
    }

    @Override
    public List<Books> selectBooks(Page page) {
        return ii.selectBooks(page);
    }

    @Override
    public int deleteById(int id) {
        return ii.deleteById(id);
    }

    @Override
    public List<Books> findBookByCondition(Books books) {
        return  ii.findBookByCondition(books);
    }

    @Override
    public Books selectById(int id) {
        return ii.selectById(id);
    }

    @Override
    public int updateBooks(Books books) {
        return ii.updateBooks(books);
    }

    @Override
    public int findCount() {
        return ii.findCount();
    }
}
