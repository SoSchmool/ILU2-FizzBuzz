package jeu.Case;

import jeu.basique.Oie;

public class Mort extends Case{
	
	public Mort() {
		super(58);
	}
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage(" je suis tombée sur la case Mort ! Retour à la case depart ");
		return oieEnJeu.getPlateau().premier_case();
	}
	
}