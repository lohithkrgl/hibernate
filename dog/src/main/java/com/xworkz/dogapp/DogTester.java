package com.xworkz.dogapp;

import com.xworkz.dogdaoapp.DogDAOImpl;

public class DogTester {
	public static void main(String[] args) {
		
		DogDAOImpl impl = new DogDAOImpl();
		impl.saveDogDao();
		impl.getDogById(2);

		
		
		
		
		
	}

	

}
