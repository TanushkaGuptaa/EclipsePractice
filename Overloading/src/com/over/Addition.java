package com.over;

import static java.lang.System.out;

public class Addition {

	static int add(int a, int b) {
		out.println("2 number int addition ");
		int sum = (int) (a + b);
		return sum;
	}

	static int add(int a, int b, int c) {
		System.out.println("---- 3 number addition-------");
		int sum = a + b + c;
		return sum;
	}

	// method overloading type of argumnets

	float add(float a, float b) {
		System.out.println("---- 2 number float addition-------");
		float sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		add(1, 2);
		add(3, 5, 6);

	}
}
