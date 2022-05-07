package com.offcn.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.offcn.bean.City;
import com.offcn.service.CityService;
import com.offcn.service.CityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryId = request.getParameter("countryId");
        CityService cityService=new CityServiceImpl();
        List<City> cities = cityService.selectCityByCountryId(Integer.parseInt(countryId));
       // response.setContentType("text/html;charset=utf-8");
        ObjectMapper objectMapper=new ObjectMapper();
        String string = objectMapper.writeValueAsString(cities);
        response.getWriter().print(string);
    }
}
