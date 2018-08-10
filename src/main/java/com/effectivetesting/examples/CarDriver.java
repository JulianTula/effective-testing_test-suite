package com.effectivetesting.examples;

public class CarDriver {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("New car created.");
		myCar.tireSensor.pressure = 29.3f;
		
		for(int i = 0; i < myCar.wheels; i++) {
			if(myCar.tireSensor.pressure > 27.0f) {
				System.out.println("Tire pressure level: normal");
			}
		}
		
		myCar.fuelLevel = 15.0f;
		
		while(myCar.fuelLevel > 0) {
			System.out.println("Engine working. Fuel level: " + Float.toString(myCar.fuelLevel));
			myCar.fuelLevel -= 0.5f;
		}

		while(myCar.oilLevel > 0) {
			System.out.println("Engine working. Oil level: " + myCar.oilLevel);
			myCar.oilLevel -= 0.5f;
		}	
	}
}
