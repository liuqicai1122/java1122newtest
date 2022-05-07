package com.offcn.dao;

import com.offcn.bean.Country;
import com.offcn.utils.DataUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryDaoImpl  implements CountryDao{

    @Override
    public List<Country> selectAllCountry() {
        List<Country> list=null;
        QueryRunner queryRunner = new QueryRunner(DataUtils.getDataSource());
        String sql="select * from country";
        try {
            list = queryRunner.query(sql, new BeanListHandler<>(Country.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
