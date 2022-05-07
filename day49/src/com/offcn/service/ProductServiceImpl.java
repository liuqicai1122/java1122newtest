package com.offcn.service;

import com.offcn.bean.Product;
import com.offcn.dao.ProductDao;
import com.offcn.dao.ProductDaoImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDao p=new ProductDaoImpl();
    @Override
    public List<Product> selectProductByName(String productname) {
        return p.selectProductByName(productname);
    }
}
