package jeu.Case;

import jeu.basique.Oie;

public class Labyrinthe extends Case {

	public Labyrinthe() {
		super(42);
	}
	
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("je suis tombée sur le Labyrinthe et je vais à la case 30");
		return oieEnJeu.getPlateau().donner_case(30);
	}
}
