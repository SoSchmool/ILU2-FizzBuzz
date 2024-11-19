package jeu.basique;

import jeu.Case.Case;

public class Oie {
	private String couleur;
	private De des;
	private Plateau plateau;
	private Journal journal;
	private Case casePlateau;
	
	public Oie(String couleur, Plateau plateau, De des) {
		this.couleur = couleur;
		this.des = des;
		this.plateau = plateau;
		this.journal = new Journal();
		this.casePlateau = plateau.premier_case();
	}
	
	public String getCouleur() {
		return couleur;
	}

	public Plateau getPlateau() {
		return plateau;
	}
	
	public void ajouterMessage(String message){
		journal.ajouterMessage(message);
	}

	public int lancerDe(){
		return (des.lancer() + des.lancer());
	}
	
	public Boolean action(){ 
		this.ajouterMessage(couleur + " joue. ");
		casePlateau = casePlateau.depart(this);
		journal.afficherMessage();
		return (casePlateau == null);
	}
}
