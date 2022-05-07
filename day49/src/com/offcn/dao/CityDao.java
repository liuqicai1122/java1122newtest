package com.offcn.dao;

import com.offcn.bean.City;

import java.util.List;

public interface CityDao {
    //通过国家id找到对应城市
    List<City> selectCityByCountryId(int countryId);
}
