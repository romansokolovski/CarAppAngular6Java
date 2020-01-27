package com.carapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.carapp.dao.CarDAO;
import com.carapp.models.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	List<Car> carList;

	// Creating the DATASET since this code does not hit a DB. 
	// carList acts as a DB to Store the car list data
	// In a real application all these data will come from a Database
	public CarDAOImpl() {
		carList = new ArrayList<>();
		Car car1 = new Car(1, "BMW", "M3", 2019);
		Car car2 = new Car(2, "Mercedes-Benz", "C63", 2019);
		Car car3 = new Car(3, "Audi", "A7", 2020);
		Car car4 = new Car(4, "Acura", "TLX", 2020);
		Car car5 = new Car(5, "Lexus", "IS300", 2020);
		Car car6 = new Car(6, "Land Rover", "Range Rover", 2020);
		Car car7 = new Car(7, "Mercedes-Benz", "G63", 2019);
		Car car8 = new Car(8, "Volkswagen", "Golf R", 2019);
		Car car9 = new Car(9, "Cadillac", "CT5", 2020);
		Car car10 = new Car(10, "Audi", "A4", 2020);

		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		carList.add(car7);
		carList.add(car8);
		carList.add(car9);
		carList.add(car10);

	}

	@Override
	public List<Car> getCarList() {
		return carList;
	}

}
