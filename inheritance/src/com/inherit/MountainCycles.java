package com.inherit;

public class MountainCycles extends CyclesTypes {

	private int noOfGears;
	private double speed;

	public MountainCycles() {
		super();
		System.out.println("---Default Constructor of Mountain Cycle------");
	}

	public MountainCycles(String wheels, int seatLevel, double price, String brand, int noOfGears, double speed) {
		super(wheels, seatLevel, price, brand);
		System.out.println("---Parameterized Constructor of Mountain Cycle------");
		this.noOfGears = noOfGears;
		this.speed = speed;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "noOfGears=" + noOfGears + ", speed=" + speed + ", Wheels=" + getWheels() + ", Seat Level="
				+ getSeatLevel() + ", Price=" + getPrice() + ", Brand=" + getBrand();
	}

}
