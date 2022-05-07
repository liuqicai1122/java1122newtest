package com.offcn.dao;

import com.offcn.bean.Product;
import com.offcn.utils.DataUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> selectProductByName(String productname) {
        List<Product>  list=null;
        if (!"".equals(productname)){
            QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
            String sql="select * from product where productname like ?";
            try {
                list = queryRunner.query(sql, new BeanListHandler<>(Product.class), "%"+productname+"%");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
