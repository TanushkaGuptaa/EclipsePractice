/**
 * 
 */
package com.inherit;

/**
 * @author Hp
 *
 */
public class ElectricCycle extends CyclesTypes {

	private String battery;

	public ElectricCycle() {
		super();
	}

	public ElectricCycle(String wheels, int seatLevel, double price, String brand, String battery) {
		super(wheels, seatLevel, price, brand);
		this.battery = battery;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ElectricCycle [battery=" + battery + ", toString()=" + super.toString() + "]";
	}

}
