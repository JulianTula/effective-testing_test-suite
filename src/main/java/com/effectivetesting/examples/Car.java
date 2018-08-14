package com.effectivetesting.examples;

public class Car {
	private int rpm;
	private Transmission transmission;
	private String message = "Current Gear: ";
	
    public Car() {
    	rpm = 0;
    	transmission = new SequentialTransmission();
	}
	
	public int getCurrentRmp() {
		return rpm;
	}
	
	public void startEngine() {
		rpm = 1000;
		System.out.println("Engine started.");
	}

	public void goForward() {
		transmission.setMode("DRIVE");
		transmission.gearUp();
		System.out.println("Going forward. " + message + transmission.showCurrentGear());
	}
	
	public void accelerate(int rpm) {
		transmission.gearUp();
		System.out.println("Accelerating: " + rpm + " rpms. " + message + transmission.showCurrentGear());
	}
}
