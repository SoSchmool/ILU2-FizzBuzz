package jeu.basique;

import java.util.Random;

public class De {
	public int lancer() {
		Random rand = new Random();
	    int nombreRandom = rand.nextInt(6)+1;
	    return nombreRandom;
	}
}
