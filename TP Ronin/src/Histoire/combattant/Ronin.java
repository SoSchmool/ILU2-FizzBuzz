package Histoire.combattant;

import Histoire.classic.Commercant;
import Histoire.classic.Humain;
import Histoire.mafia.Yakuza;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(int argent, String boisson, String nom){
		super(argent, boisson, nom);
	}
	
	void donner(Commercant commercant, int argent) {
		commercant.ajouterArgent(argent);
	}
	
	void provoquer(Yakuza yakuza) {
		if ((this.honneur*2) > yakuza.getReputation()) {
			ajouterArgent(yakuza.getArgent());
			yakuza.perdre();
			this.honneur+=1;
			parler("N'ayez plus crainte !");
		}else{
			yakuza.gagner();
			this.honneur-=1;
			parler("J'ai perdu ");
		}
	}
	
}
