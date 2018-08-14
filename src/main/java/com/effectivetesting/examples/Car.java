package com.effectivetesting.examples;

public class Car {
	private int rpm;	
	private TireSensor tireSensor;
	
	
    public Car() {
    	rpm = 0;
    	tireSensor= new TireSensor();
	}
	
	public int getCurrentRmp() {
		return rpm;
	}
	
	public void startEngine() {
		rpm = 1000;
		System.out.println("Engine started.");
		System.out.println("Tire Pressure Level:"+ tireSensor.getTirePressure);
	}
	
	
}


	