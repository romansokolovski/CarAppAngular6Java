package com.carapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.dao.CarDetailsDAO;
import com.carapp.models.CarDetails;
import com.carapp.service.CarDetailsService;

@Service
public class CarDetailsServiceImpl implements CarDetailsService {
	
	@Autowired
	CarDetailsDAO carDetailsDao;

	@Override
	public CarDetails getCarDetails(int id) {
		return carDetailsDao.getCarDetails(id);
	}

}
