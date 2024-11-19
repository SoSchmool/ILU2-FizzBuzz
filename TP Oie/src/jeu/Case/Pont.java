package jeu.Case;

import jeu.basique.Oie;

public class Pont extends Case {

	public Pont() {
		super(6);

	}
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("je suis tombée sur la case Pont, je vais à la case 12");
		return oieEnJeu.getPlateau().donner_case(12);
	}
}
