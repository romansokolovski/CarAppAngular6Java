package com.carapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carapp.models.Car;
import com.carapp.models.CarDetails;
import com.carapp.models.CarDetailsReq;
import com.carapp.service.CarDetailsService;
import com.carapp.service.CarService;

@RestController
public class WebController {
	
	@Autowired
	CarService carService;
	
	@Autowired
	CarDetailsService carDetailsService;

	@RequestMapping("/carlist")
	public List<Car> CarListAPI() {
		
		List<Car> carList = carService.getCarList();
		return carList;
	}
	
	@RequestMapping(value = "/cardetailsapi", method = RequestMethod.POST)
	public CarDetails CarDetailsAPI(@RequestBody CarDetailsReq inputPayload) {
		
		int id = inputPayload.getId();
		
		CarDetails carDetails = carDetailsService.getCarDetails(id);
		return carDetails;
	}

}
