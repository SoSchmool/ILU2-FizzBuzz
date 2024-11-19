package jeu.Case;

import jeu.basique.Oie;
import jeu.basique.Plateau;

public class Case{
	 int NumCase;

	public Case(int NumCase){
		this.NumCase = NumCase;
	}
	
	 public String getNom(){
		 return "numero" + " "+ NumCase;
	 }
	 
	 public Case depart(Oie OieEnJeu){
	 	int ValeurDes = OieEnJeu.lancerDe();
	 	OieEnJeu.ajouterMessage("J'ai lancé les dés et j'ai eu " + ValeurDes + ". ");
	 	Case CaseArrivee = caseSuivante(OieEnJeu, NumCase + ValeurDes);
	 	CaseArrivee = CaseArrivee.arrivee(OieEnJeu); 
	 	return CaseArrivee;
	 } 
	 
	public Case caseSuivante(Oie OieEnJeu,int CaseSuivante){
		Plateau plateau = OieEnJeu.getPlateau();
	 	Case CaseArrivee = plateau.donner_case(CaseSuivante);
	 	return CaseArrivee;
	 }
	 
	 public Case arrivee(Oie oieEnJeu){
	 	String nomCase = getNom();
	 	oieEnJeu.ajouterMessage("Je me retrouve sur la case " + nomCase);
	 	return this;
	 }
}
