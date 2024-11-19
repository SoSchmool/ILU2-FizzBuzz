package jeu.Case;

import jeu.basique.Oie;

public class Jardin extends Case {
	
	public Jardin() {
		super(63);
	}
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("Félicitations ! Vous avez gagné la partie. ");
		return null;
	}
}
