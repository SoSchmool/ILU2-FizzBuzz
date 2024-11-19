package Histoire.classic;

public class Commercant extends Humain{

	public Commercant(int argent, String boisson, String nom) {
		super(argent,"Thé", nom);
	}
	
	public int seFaireExtorquer() {
		parler("À l'aide !");
		return perdreArgent(getArgent());
	}
	
	public void recevoir(int argent) {
		this.ajouterArgent(argent);
		parler("Merci !");
	}

}
