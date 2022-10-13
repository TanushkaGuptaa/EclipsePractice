package com.student;

import java.util.Scanner;

public class TestStudent {

	static void displayStudent(Student[] s1) {

		for (Student obj : s1) {
			System.out.println("Name:" + obj.getName() + " Score:" + obj.getScore() + "  Course:" + obj.getCourse());
		}
	}

	// method overloading
	static void displayStudents(Student[] s1, double marks) {

		for (Student obj : s1) {
			if (obj.getScore() >= marks)
				System.out
						.println("Name:" + obj.getName() + " Score:" + obj.getScore() + "  Course:" + obj.getCourse());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[4];// array declaration

		s[0] = new Student(1, "Sudip", 23, 78.9);
		s[1] = new Student(2, "kunal", 20, 90.8, "MCA");
		s[2] = new Student(3, "Sweety", 22, 89.7);
		s[3] = new Student(4, "tanu", 19, 80.7, "MCA");

		int ch;
		System.out.println("Enter 1 to see all students:");
		System.out.println("Enter 2 to see students above 90");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();// user input

		switch (ch) {
		case 1:
			displayStudent(s);
			break;
		case 2:
			displayStudents(s, 90.0);
			break;
		default:
			System.out.println("Wrong input");

		}
		sc.close();
	}

}
