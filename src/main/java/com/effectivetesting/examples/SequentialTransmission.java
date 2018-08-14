package com.effectivetesting.examples;

public class SequentialTransmission implements Transmission {
	private int currentGear;
	private String mode;
	private int maxGear = 6;
	
	public SequentialTransmission() {
		this.currentGear = 0;
		this.mode = "NEUTRAL";
	
	}

	public void setMode(String mode) {

	}

	public void gearUp() {
		if(currentGear < maxGear) {
				currentGear = currentGear + 1;
			}
		}
	

	public void gearDown() {
		if(currentGear >= 1)
		currentGear = currentGear - 1;
	}

	public int showCurrentGear() {
		return currentGear;
	}
}
