
public class Predateur extends Animal {
	private Proie[] proies = new Proie[100];
	private int nbProies = 0;
	
	public Predateur(String nom, Proie proie) {
		super(nom);
		ajouterProie(proie);
	}
	
	public void ajouterProie(Proie proie) {
		proies[nbProies] = proie;
		nbProies++;
	}

	@Override
	/*public String sePresenter() {
		return super.sePresenter() + " et je suis un prédateur";
	}*/
	
	public void rencontre(Animal animal) {
		System.out.print(this + " s'approche de " + animal);
		if(animal instanceof Proie) {
			Proie proie = (Proie) animal;
			if(estComestible(proie)) {
				System.out.println(" et n'en fait qu'une bouchée");
			}else {
				System.out.println("mais n'est pas à son gout");
			}
		}else {
			System.out.println(", un rival et décide de changer de zone");
		}
	}
	
	private boolean estComestible(Proie proie) {
		for (int i =0; i < nbProies; i++) {
			Proie proieComestible = proies[i];
			if (proieComestible.equals(proie)) {
				return true;
			}
		}
		return false;
	}
}
