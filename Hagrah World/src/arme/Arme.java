package arme;

public class Arme {
	private int durabilite;
	private int tranchant;
	private int portee;
	private int degats;
	
	public Arme(int durabilite, int tranchant, int portee, int degats) {
		this.durabilite = durabilite;
		this.tranchant = tranchant;
		this.portee = portee;
		this.degats = degats;
	}
	
	public int getDurabilite() {
		return this.durabilite;
	}
	
	public int getTranchant() {
		return this.tranchant;
	}
	
	public int getPortee() {
		return this.portee;
	}
	
	public int getDegats() {
		return this.degats;
	}

}
