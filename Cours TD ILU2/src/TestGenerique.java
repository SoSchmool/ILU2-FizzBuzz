
public class TestGenerique {

	public static void main(String[] args) {
		Enclos<Loup> loups = new Enclos<>(new Loup[10]);
		Enclos<Mouton> moutons = new Enclos<>(new Mouton[10]);
		loups.ajouterAnimal(new Loup("Tala"));
		loups.ajouterAnimal(new Loup("Syf"));
		moutons.ajouterAnimal(new Mouton("Berta"));
		System.out.println(loups);
		System.out.println(moutons);
		
		

	}

}
