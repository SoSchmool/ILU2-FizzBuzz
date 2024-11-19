package Histoire.mafia;

import Histoire.classic.Commercant;
import Histoire.classic.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(int argent, String boisson, String nom, String clan, int reputation){
		super(argent, boisson, nom);
		this.clan=clan;
		this.reputation=reputation;
	}

	public void extorquer ( Commercant commercant) {
		int vol = commercant.getArgent();
		commercant.seFaireExtorquer();
		ajouterArgent(vol);
		this.reputation+=1;
		parler("Je t'ai tout volé !");
	}
	
	public void gagner() {
		this.reputation+=1;
		parler("C'est qui le boss ?!");
	}
	
	public void perdre() {
		this.reputation-=1;
		perdreArgent(getArgent());
	}
	
	String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
	}
	
	 public void direBonjour(){
		super.direBonjour();
		parler("Je fais partie du clan "+this.clan);
	}
}
