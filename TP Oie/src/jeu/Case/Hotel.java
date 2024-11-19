package jeu.Case;

import jeu.basique.Oie;

public class Hotel extends Case {
		private int compteur;
		
		public Hotel(){
			super(19);
			compteur = 2;
		}
		
		public Case arrivee(Oie oieEnJeu){
			Hotel hotel = new Hotel();
			oieEnJeu.ajouterMessage("je suis tombée sur l'hotel ");
			return hotel;
		}

		public Case depart(Oie oieEnJeu){
			String couleur = oieEnJeu.getCouleur();
			if (compteur > 0){
				oieEnJeu.ajouterMessage("L'oie " + couleur + " se repose tranquille à l'hotel pendant " + compteur + " tours. Elle aura bien bronzé ");
				compteur--;
				return this;
			}
			else {
				oieEnJeu.ajouterMessage("L'oie " + couleur + " est sur la case Hotel ");
				int valeurDes = oieEnJeu.lancerDe();
				oieEnJeu.ajouterMessage("elle fait " + valeurDes + " ");
				Case caseArrivee = caseSuivante(oieEnJeu, valeurDes + NumCase);
				return caseArrivee;
			}
		}
		
	}