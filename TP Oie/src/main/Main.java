package main;

import jeu.basique.JeuOie;

public class Main {

	public static void main(String[] args) {
		JeuOie jeuOie = new JeuOie(5); 
		jeuOie.ajouterOie("Verte");
		jeuOie.ajouterOie("Jaune");
		jeuOie.ajouterOie("Bleu");
		jeuOie.ajouterOie("Rouge");
		jeuOie.ajouterOie("Orange");

		jeuOie.jouer();
	}
}
