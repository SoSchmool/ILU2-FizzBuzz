package Histoire.classic;

public class Humain {
	private int argent;
	private String boisson;
	private String nom;
	
	public Humain(int argent, String boisson, String nom) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}
	
	public int ajouterArgent(int somme) {
		return this.argent += somme;
	}
	
	public void parler(String texte) {
		System.out.println("( "+this.nom+" ) - "+texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle : "+this.nom+" et j'aime boire du "+this.boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+this.boisson+" ! GLOUPS !");
	}
	
	public int perdreArgent(int somme) {
		return this.argent -= somme;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public String getNom() {
		return this.nom;
	}
	
}
