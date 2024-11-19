package jeu.Case;

import jeu.basique.Oie;

public class Fast extends Case {
	public Fast(int numCase) {
		super(numCase);
	}
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("Je suis tombée sur une case Fast et je relance !\n");
		return this.depart(oieEnJeu);
	}
}
