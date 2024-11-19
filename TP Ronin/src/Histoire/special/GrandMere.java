package Histoire.special;

import Histoire.classic.Humain;
import Histoire.combattant.Traitre;

public class GrandMere extends Humain{
	private int nombre;
	private int rand;
	private Humain ragot;
	private String [] classe = {"Commercant","Ronin","Samurai","Yakuza"};
	private Humain [] memoire = new Humain [30];  
	private int connaissance=0;
	
	
	public GrandMere(int argent, String boisson, String nom) {
		super(argent,"tisane",nom);
	}
	
	
	public void faireConnaissance(Humain humain) {
		memoire[connaissance]=humain;
		connaissance+=1;
	}
	
	private Humain humainHasard() {
		rand=(int)(Math.random() * ( connaissance - 0 ));
		return memoire[rand];
	}
	public void ragoter() {
		ragot=humainHasard();
		if (ragot instanceof Traitre) {
			parler("Je suis sûr que "+ragot.getNom()+" est un traître");
		}else {
			nombre=(int)(Math.random() * ( 3 - 0 ));
			parler("Je pense que "+ragot.getNom()+" est un "+classe[nombre]);
		}
	}
}