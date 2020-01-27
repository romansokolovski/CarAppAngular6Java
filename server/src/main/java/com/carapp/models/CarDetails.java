package com.carapp.models;

public class CarDetails {
	  int id;
	  String make;
	  String model;
	  int year;
	  int kilometers;
	  int price;
	  String description;
	  String picture;
	  String interiorPicture;

	public CarDetails(int id, String make, String model, int year, int kilometers, int price, String description, String picture, String interiorPicture) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.kilometers = kilometers;
		this.price = price;
		this.description = description;
		this.picture = picture;
		this.interiorPicture = interiorPicture;
	}
	public int getKilometers() {
		return kilometers;
	}
	public String getDescription() {
		return description;
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
	public int getYear() {
		return year;
	}
	public int getPrice() {
		return price;
	}
	public String getPicture(){return picture;}
	public String getInteriorPicture(){return interiorPicture;}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setYear(int year) { this.year = year; }
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPicture(String picture){this.picture = picture;}
	public void setInteriorPicture(String interiorPicture){this.interiorPicture = interiorPicture;}

}
