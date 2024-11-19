package jeu.Case;

import jeu.basique.Oie;

public class Prison extends Case {
	Oie Prisonnier;
	
	public Prison(){
		super(52);
		
	}
	
	public Case arrivee(Oie oieEnJeu) {
		Prisonnier = oieEnJeu;
		Case caseArrivee = super.arrivee(oieEnJeu);
		return caseArrivee;
	}

	public Case depart(Oie oieEnJeu) {
		if (Prisonnier.getCouleur().equals(oieEnJeu.getCouleur())){
			oieEnJeu.ajouterMessage("L'oie " + oieEnJeu.getCouleur() + " est toujours en prison");
			return this;
		}
		else {
			return (super.depart(oieEnJeu));
		}
	}
}