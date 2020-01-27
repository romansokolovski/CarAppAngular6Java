package com.carapp.models;

public class Car {
	int id;
	String make;
	String model;
	int year;
	public Car(int id, String make, String model, int year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public int getId() {
		return id;
	}
	public String getMake() {
		return make;
	}
	public int getYear() { return year; }
	public void setModel(String model) {
		this.model = model;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
