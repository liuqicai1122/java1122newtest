package com.offcn.dao;

import com.offcn.bean.Books;
import com.offcn.bean.Page;
import com.offcn.utils.DataUtils;
import com.offcn.utils.DateUtil;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.print.attribute.HashAttributeSet;
import java.awt.print.Book;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements  BooksDao {
    @Override
    public int insertBooks(Books books) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="insert into books value(null,?,?,?,?,?,?)";
        try {
            i = queryRunner.update(sql, books.getBooknum(), books.getBookname(), books.getBookauthor(), books.getBookpublish(), books.getBookdate(),books.getBookprice());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Books> selectBooks(Page page) {
       List<Books> list=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from books limit ?,?";
        try {
            list = queryRunner.query(sql, new BeanListHandler<>(Books.class),(page.getCurrentPage()-1)*page.PAGESIZE,page.PAGESIZE );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int deleteById(int id) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="delete from books where id= ?";
        try {
            i = queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Books> findBookByCondition(Books books) {
        List<Books> list=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql=getSql(books);
        try {
            list= queryRunner.query(sql, new BeanListHandler<>(Books.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Books selectById(int id) {
        Books books=new Books();
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from  books where id=?";
        try {
            books = queryRunner.query(sql, new BeanHandler<>(Books.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
        //修改
    @Override
    public int updateBooks(Books books) {
        int i=0;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String  sql="update books set booknum = ?,bookname = ?,bookauthor = ?,bookpublish = ?,bookdate = ?,bookprice = ? where id = ?";
        try {
            i = queryRunner.update(sql, books.getBooknum(), books.getBookname(), books.getBookauthor(), books.getBookpublish(), books.getBookdate(), books.getBookprice(),books.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int findCount() {
        Long count=0L;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select count(*) from books";
        try {
            count = (Long)queryRunner.query(sql, new ScalarHandler<>());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count.intValue();
    }

    //根据条件书写sql语句
    private String getSql(Books books) {
       //select  * from books where 1=1;
        StringBuilder sql=new StringBuilder("select * from books where 1=1");
        // 空格 and booknum like '%book%'
        if (books.getBooknum()!=null && !"".equals(books.getBooknum().trim())){
            sql.append(" and booknum like '%").append(books.getBooknum()).append("%'");
        }
        if (books.getBookname()!=null && !"".equals(books.getBookname().trim())){
            sql.append(" and bookname like '%").append(books.getBookname()).append("%'");
        }
        if (books.getBookauthor()!=null && !"".equals(books.getBookauthor().trim())){
            sql.append(" and bookauthor like '%").append(books.getBookauthor()).append("%'");
        }
        if (books.getBookpublish()!=null && !"".equals(books.getBookpublish().trim())){
            sql.append(" and bookpublish like '%").append(books.getBookpublish()).append("%'");
        }
        //and bookdate =2021-2-2
        if (books.getBookdate()!=null){
            sql.append(" and bookdate = '").append(DateUtil.dateToString(books.getBookdate())).append("'");
        }
        if (books.getBookprice()!=0){
            sql.append(" and bookprice= ").append(books.getBookprice());
        }
        return sql.toString();
    }

}
