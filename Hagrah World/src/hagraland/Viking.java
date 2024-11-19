package hagraland;

import arme.Arme;

public class Viking extends Pelo {
	private String clan;
	private Arme arme;
	
	public Viking(String nom, int vie, String clan, Arme arme) {
		super(nom,vie);
		this.clan = clan;
		this.arme = arme;
	}
	
	public void provoquer() {
		parler(" Viens te castagne !");
	}
	
	public void attaquer(Pelo p1) {
		parler("Pour "+this.clan);
		p1.PerdreVie(arme.getDegats());
	}
	
	public String getClan() {
		return this.clan;
	}

}
