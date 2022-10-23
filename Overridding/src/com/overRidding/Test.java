package com.overRidding;//test the other classes

public class Test {
	public static void main(String args[]) {
		Vehicle v = new Vehicle();// create object
		v.msg("My Vehicle");

		Car c = new Car();
		c.msg("MyCar");

		Bike b = new Bike();
		b.msg("My Bike");
	}

}
