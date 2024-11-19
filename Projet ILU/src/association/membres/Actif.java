package association.membres;

public class Actif extends Associatif{
	private boolean clé=false;

	
	public Actif(String nom, int motivation, boolean clé) {
		super(nom, motivation);
		this.clé=clé;
	}
	
	public boolean avoirClé() {
		return this.clé;
	}
	
	public boolean recevoirClé() {
		return this.clé=true;
	}
	
	
	
}
