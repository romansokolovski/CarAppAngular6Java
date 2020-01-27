package com.carapp.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.carapp.dao.CarDetailsDAO;
import com.carapp.models.CarDetails;

@Repository
public class CarDetailsDAOImpl implements CarDetailsDAO {
	
	Map<Integer, CarDetails> carDetailsMap;

	// carDetailsMap Stores data on all the car details
	// In a real application all these data will come from a Database
	public CarDetailsDAOImpl() {

		carDetailsMap = new HashMap<>();
		CarDetails carDetails1 = new CarDetails(1, "BMW", "M3", 2019,
				56000, 75000, "Great condition M3","https://i.gaw.to/content/photos/38/61/386110_2020_BMW_3_Series.jpg",
				"https://www.autorevival.com/wp-content/uploads/2019/05/2020-BMW-M3-Interior.jpg");
		CarDetails carDetails2 = new CarDetails(2, "Mercedes-Benz", "C63", 2019,
				20000, 82000, "Super fast Benz","https://images.hgmsites.net/hug/2019-mercedes-benz-c-class_100648451_h.jpg",
				"https://cdn.carbuzz.com/gallery-images/1600/441000/600/441610.jpg");
		CarDetails carDetails3 = new CarDetails(3, "Audi", "A7", 2020,
				3000, 68500, "Brand new Demo Audi A7","https://cdn.carbuzz.com/gallery-images/2018-2020-audi-a7-sportback-front-view-driving-carbuzz-448586-1600.jpg",
				"https://cdn.carbuzz.com/gallery-images/2020-audi-a7-sportback-infotainment-system-carbuzz-448638-840x560.jpg");
		CarDetails carDetails4 = new CarDetails(4, "Acura", "TLX", 2020,
				1000, 43000, "Brand new Demo Acura TLX A-Spec","https://static.cargurus.com/images/article/2019/09/04/11/33/2020_acura_tlx_test_drive_overview-pic-850893993966172938-640x480.jpeg",
				"https://static.cargurus.com/images/article/2019/09/04/11/38/2020_acura_tlx_test_drive_overview-pic-6459500879585715589-640x480.jpeg");
		CarDetails carDetails5 = new CarDetails(5, "Lexus", "IS300", 2020,
				5000, 51000, "Brand new Demo Lexus IS300 Sport","https://media.ed.edmunds-media.com/lexus/is-300/2018/ot/2018_lexus_is-300_LIFE1_ot_1024171_717.jpg",
				"https://content.autotrader.com/content/dam/autotrader/articles/Cars/Lexus/IS/2020/2020LexusIS/2020-Lexus-IS-(3).jpg");
		CarDetails carDetails6 = new CarDetails(6, "Land Rover", "Range Rover", 2020,
				54, 95000, "Brand new from factory 2020 Range Rover Sport","https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/1049x590/quality/80/https://s.blogcdn.com/slideshows/images/slides/757/074/8/S7570748/slug/l/2020-range-rover-1.jpg",
				"https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/1049x590/quality/80/https://s.blogcdn.com/slideshows/images/slides/757/074/5/S7570745/slug/l/2020-range-rover-1.jpg");
		CarDetails carDetails7 = new CarDetails(7, "Mercedes-Benz", "G63", 2019,
				20000, 110000, "Lightly used G-Wagon","https://scdn.slashgear.com/wp-content/uploads/2018/12/2019-mercedes-amg-g63-5-1280x720.jpg",
				"https://scdn.slashgear.com/wp-content/uploads/2018/01/2019-mercedes-benz-g550-9.jpg");
		CarDetails carDetails8 = new CarDetails(8, "Volkswagen", "Golf R", 2019,
				10000, 39500, "Stunning 2019 Golf R","https://content.autotrader.com/content/dam/autotrader/articles/Cars/Volkswagen/Golf/2019/2019VolkswagenGolfR/2019-Volkswagen-Golf-R-(1).jpg",
				"https://blogmedia.dealerfire.com/wp-content/uploads/sites/265/2019/09/2019-Volkswagen-Golf-R_B2_o.jpg");
		CarDetails carDetails9 = new CarDetails(9, "Cadillac", "CT5", 2020,
				10, 51000, "Newly Redesigned CT5","https://cnet4.cbsistatic.com/img/QN7Ujnzgx6j_c1S0kugj-FK3Ua0=/2019/05/30/8797f187-0992-4ecb-8490-a3b109bdc639/2020-cadillac-ct5-v-002.jpg",
				"https://gmauthority.com/blog/wp-content/uploads/2019/05/2020-Cadillac-CT5-Premium-Luxury-Interior-2019-New-York-International-Auto-Show-001-cockpit.jpg");
		CarDetails carDetails10 = new CarDetails(10, "Audi", "A4", 2020,
				50, 47500, "Brand new Classic Audi A4","https://cdn.carbuzz.com/gallery-images/2020-audi-a4-sedan-carbuzz-605252-1600.jpg",
				"https://cdn.carbuzz.com/gallery-images/2020-audi-a4-sedan-carbuzz-605258-1600.jpg");
		
		carDetailsMap.put(1, carDetails1);
		carDetailsMap.put(2, carDetails2);
		carDetailsMap.put(3, carDetails3);
		carDetailsMap.put(4, carDetails4);
		carDetailsMap.put(5, carDetails5);
		carDetailsMap.put(6, carDetails6);
		carDetailsMap.put(7, carDetails7);
		carDetailsMap.put(8, carDetails8);
		carDetailsMap.put(9, carDetails9);
		carDetailsMap.put(10, carDetails10);


	}

	@Override
	public CarDetails getCarDetails(int id) {
		// TODO Auto-generated method stub
		return carDetailsMap.get(id);
	}

}
