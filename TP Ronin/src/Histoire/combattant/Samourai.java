package Histoire.combattant;

public class Samourai extends Ronin{
	private String seigneur;

	public Samourai(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom);
		this.seigneur=seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers mon Seigneur "+this.seigneur);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	
	

}
