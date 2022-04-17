package com.bidhan.interview;

// Program to demonstrate Classes and Objects

public class ClassDemoCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar=new Car();
		
		myCar.brand="BMW";
		myCar.color="White";
		myCar.price=10000;
		
		myCar.details();
		myCar.start();
		myCar.drive();
		myCar.stop();
	}
	
	public static class Car{

		String brand;
		String color;
		int price;
		
		void details() {
			System.out.println("Brand: "+brand+", Color: "+color+", Price: "+price);
		}
		
		void start() {
			System.out.println("Car has started!!!");
		}
		
		void drive() {
			System.out.println("Car is running!!!");
		}
		
		void stop() {
			System.out.println("Car has stopped!!!");
		}
		
	}

}
