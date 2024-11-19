package jeu.basique;

import jeu.Case.Case;
import jeu.Case.Fast;
import jeu.Case.Hotel;
import jeu.Case.Jardin;
import jeu.Case.Labyrinthe;
import jeu.Case.Mort;
import jeu.Case.Pont;
import jeu.Case.Prison;
import jeu.Case.Puit;


public class Plateau {
	int Nb_cases = 63;
	int Numcases=0;
	Case[] Cases  = new Case[Nb_cases];
	public Plateau() {
		for (int Numcases=0 ; Numcases<Nb_cases ; Numcases++){
			Cases[Numcases] = new Case(Numcases+1);
		intialisationCasesSpecifique();
		}
	}

	public Case premier_case(){
		return Cases[0];
	}
	
	public Case donner_case(int numero){
		if (numero > 63){
			return (Cases[125 - numero]);
		}
		else {
			return Cases[numero-1];
		}
	}
	
	public void intialisationCasesSpecifique(){
		Cases[51] = new Prison();
		Cases[57] = new Mort();
		Cases[30] = new Puit();
		Cases[5] = new Pont();
		Cases[41] = new Labyrinthe();
		Cases[18] = new Hotel();
		Cases[62] = new Jardin();
		for (int i = 9; i <= 54; i=i+9) {
			Cases[i-1] = new Fast(i);
		}
		
	}
}	
