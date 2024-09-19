
public class Enclos<T extends Animal> {
	private T[] animaux;
	private int nbAnimaux = 0;
	
	public Enclos(T[] animaux) {
		this.animaux = animaux;
	}
	
	public void ajouterAnimal(T animal) {
		animaux[nbAnimaux] = animal;
		nbAnimaux++;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder("Dans l'enclos, il y a :\n");
		for (int i=0; i<nbAnimaux; i++) {
			T animal = animaux[i];
			chaine.append("- " + animal + "\n");
		}
		return chaine.toString();
	}

}
