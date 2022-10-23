package com.Players;

import java.util.Scanner;

public class Test {

	static void callPlayer(Plyaers p) {

		boolean status;

		status = p.checkPlayer(p);
		if (status)
			System.out.println(p.getName() + " of age :" + p.getAge() + " is allowed to play ");
		else
			System.out.println(p.getName() + " of age :" + p.getAge() + "  is not allowed to play ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FootBall fp = new FootBall();
		System.out.println("FootBall:");
		System.out.println("Enter the name:");
		fp.setName(sc.next());
		System.out.println("Enter the age:");
		fp.setAge(sc.nextInt());
		callPlayer(fp);

		Hockey hp = new Hockey();
		System.out.println("Hockey:");
		System.out.println("Enter the name:");
		hp.setName(sc.next());
		System.out.println("Enter the age:");
		hp.setAge(sc.nextInt());
		callPlayer(hp);

		sc.close();

	}

}
