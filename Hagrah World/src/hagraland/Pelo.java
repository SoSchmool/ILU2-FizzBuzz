package hagraland;

public class Pelo {
	private String nom;
	protected int vie;
	
	public Pelo(String nom, int vie) {
		this.nom = nom;
		this.vie = vie;
	}
	
	public int PerdreVie(int valeur) {
		if ((this.vie - valeur) <= 0) {
			System.out.println("( La Mort ) - Tu es mort ( "+this.nom+" )");
			return this.vie = 0;
		}else {
		return this.vie -= valeur;
		}
	}
	
	public void parler(String texte) {
		System.out.println("( "+this.nom+" ) - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je suis "+this.nom);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getVie() {
		return this.vie;
	}
	
	
	

}
