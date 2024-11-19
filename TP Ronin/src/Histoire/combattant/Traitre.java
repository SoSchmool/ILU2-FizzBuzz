package Histoire.combattant;

import Histoire.classic.Commercant;
import Histoire.classic.Humain;

public class Traitre extends Samourai{
	private float traitrise;

	public Traitre(int argent, String boisson, String nom, String seigneur, float traitrise){
		super(argent, boisson, nom, seigneur);
		this.traitrise=traitrise;
	}
	
	public float getTraitrise() {
		return this.traitrise;
	}
	public void extorquer ( Commercant commercant) {
		if (this.traitrise > 3) {
			parler("Tu forces poto ");
		}else {
		int vol = commercant.getArgent();
		commercant.seFaireExtorquer();
		ajouterArgent(vol);
		this.traitrise+=1;
		}
	}
	
	
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Niveau de traitrise : "+getTraitrise());
	}
	
	public void FaireLeGentil(Humain humain, int valeur){
		perdreArgent(valeur);
		humain.ajouterArgent(valeur);
		this.traitrise-=valeur*0.1;
		if (this.traitrise < 0) {
			this.traitrise=0;
		}
	}
}
