package com.offcn.dao;

import com.offcn.bean.Book;
import com.offcn.utils.DataUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao{
    @Override
    public Book selectById(int id) {
        Book book=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from book where id=?";
        try {
            book = queryRunner.query(sql, new BeanHandler<>(Book.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public int updateBook(Book book) {
         int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="update book set name=?,author=? where id=?";
        try {
            i = queryRunner.update(sql, book.getName(), book.getAuthor(), book.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Book> selectAll() {
        List<Book> list=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from book ";
        try {
            list = queryRunner.query(sql, new BeanListHandler<>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }

    @Override
    public int deleteBookById(int id) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="delete from book where id=? ";
        try {
            i = queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
