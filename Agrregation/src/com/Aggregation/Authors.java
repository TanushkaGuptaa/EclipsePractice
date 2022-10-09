package com.Aggregation;

public class Authors {

	static void display(WrittenBooks a1) {
		System.out.println(a1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrittenBooks a1 = new WrittenBooks("Ramayan", "Amish", 89,
				new Address("AG 44", "Mumbai", 450089, "Maharashtra", "India"));

		System.out.println("Details are:");

		display(a1);
	}

}
