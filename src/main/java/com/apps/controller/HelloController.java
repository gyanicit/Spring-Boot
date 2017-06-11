package com.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apps.domain.City;
import com.apps.model.dao.CityDAO;
import com.apps.service.MyService;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	@RequestMapping("/")
	public String baseController(){
		return myService.getMessage();
	}
	
	@RequestMapping("/city/save")
	public String saveCity(){
		try {
			City city=new City();
			city.setName("Noida");
			cityDAO.save(city);
			return "City Saved";
		} catch (Exception e) {
			e.printStackTrace();
			return "Fail to save city";
		}
	}
	
	@Autowired
	MyService myService;
	@Autowired
	CityDAO cityDAO;
}
