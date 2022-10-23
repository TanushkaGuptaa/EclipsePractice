package com.Players;

public class Hockey extends Plyaers {

	public boolean checkPlayer(Plyaers p) {

		if (p.getAge() > 12)
			return true;
		else
			return false;

	}
}
