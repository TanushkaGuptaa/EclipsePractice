package com.Abstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Car c;

		Porsche c1 = new Porsche();
		c = c1;
		c.StartCar();

		Bugati c2 = new Bugati();
		c = c2;
		c.StartCar();// dynamic method dispatch

	}

}
