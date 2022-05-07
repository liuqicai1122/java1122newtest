package com.offcn.service;

import com.offcn.bean.City;

import java.util.List;

public interface CityService {
    //通过国家id找到对应城市
    List<City> selectCityByCountryId(int countryId);
}
