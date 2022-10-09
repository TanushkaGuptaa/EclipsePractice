package com.inherit;

public class CycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MountainRacingCycles cycle2 = new MountainRacingCycles("Alloy", 3, 67000.90, "Firefox", 5, 30, true, "LED",
				"NOS");
		System.out.println(cycle2);

		ElectricCycle ecycle1 = new ElectricCycle("Rim wheels", 2, 25000.50, "Avon", "Lithium");
		System.out.println(ecycle1);

		MountainCycles cycle3 = new MountainCycles("rem eheels", 3, 67000.78, "avon", 6, 30);
		System.out.println(cycle3);

	}

}
