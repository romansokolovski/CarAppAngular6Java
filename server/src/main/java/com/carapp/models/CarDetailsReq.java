package com.carapp.models;

public class CarDetailsReq {
	int id;

	//empty constructer is needed for JSON deserialization
	public CarDetailsReq() {}
	
	public CarDetailsReq(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
