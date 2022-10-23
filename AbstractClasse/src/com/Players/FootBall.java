package com.Players;

public class FootBall extends Plyaers {

	public boolean checkPlayer(Plyaers p) {

		if (p.getAge() > 9)
			return true;
		else
			return false;

	}

}
