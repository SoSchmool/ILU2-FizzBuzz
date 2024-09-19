import java.util.Random;

public class Foret{
	private Animal[] animaux = new Animal[100];
	int nbAnimaux = 2;
	private Random random = new Random();
	
	public Foret(Animal animal1, Animal animal2) {
		animaux[0] = animal1;
		animaux[1] = animal2;
	}
	
	public void ajoutAnimal(Animal animal) {
		animaux[nbAnimaux] = animal;
		nbAnimaux++;
	}
	
	public void genererRencontre() {
		int numAnimal1 = random.nextInt(nbAnimaux);
		int numAnimal2;
		do {
			numAnimal2 = random.nextInt(nbAnimaux);
		} while (numAnimal1 == numAnimal2);
		animaux[numAnimal1].rencontre(animaux[numAnimal2]);
	}

}
