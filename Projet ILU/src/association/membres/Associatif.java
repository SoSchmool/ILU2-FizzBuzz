package association.membres;

public class Associatif {
	private String nom;
	private int motivation;
	
	public Associatif(String nom, int motivation) {
		this.nom=nom;
		this.motivation=motivation;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getMotivation() {
		return this.motivation;
	}
	
	public int plusMotivé() {
		if(this.motivation < 100 && this.motivation >= 90) {
			this.motivation = 100;
		}
		else if (this.motivation < 90) {
			this.motivation+=10;
		}
		return this.motivation;	
	}
	
	public int moinsMotivé() {
		if(this.motivation < 10 && this.motivation > 0) {
			this.motivation = 0;
		}
		else if (this.motivation > 10) {
			this.motivation-=10;
		}
		return this.motivation;	
	}
	
	
	
}
