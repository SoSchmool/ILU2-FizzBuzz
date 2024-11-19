package jeu.Case;
import jeu.basique.Oie;

public class Puit extends Case {
	Oie Tombée;
	public Puit() {
		super(31);
	}

	public Case arrivee(Oie oieEnJeu) {
		Tombée = oieEnJeu;
		Case caseArrivee = super.arrivee(oieEnJeu);
		return caseArrivee;
	}

	public Case depart(Oie oieEnJeu) {

		if (Tombée.getCouleur().equals(oieEnJeu.getCouleur())){
			oieEnJeu.ajouterMessage("L'oie " + oieEnJeu.getCouleur() + " est toujours dans le puit");
			return this;
		}
		
		else{
			return (super.depart(oieEnJeu));
		}
	}
}