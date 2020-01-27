package com.carapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.dao.CarDAO;
import com.carapp.models.Car;
import com.carapp.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarDAO carDao;

	@Override
	public List<Car> getCarList() {
		return carDao.getCarList();
	}

}
