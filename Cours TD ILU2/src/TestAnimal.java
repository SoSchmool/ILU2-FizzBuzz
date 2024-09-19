
public class TestAnimal {

	public static void main(String[] args) {
		Proie poule = new Proie("poule", "blé");
		poule.ajouterAliment("betteraves");
		Proie mouton = new Proie("mouton", "blé");
		Predateur loup = new Predateur("loup", mouton);
		Animal ocelot = new Predateur("ocelot", poule);
		

		Foret foret = new Foret(poule, mouton);
		foret.ajoutAnimal(ocelot);
		
		Animal[] animaux = {poule, mouton, loup, ocelot};
		for (int  i = 0; i < animaux.length; i++) {
			animaux[i].rencontre(animaux[(i+1)%4]);
		}
		
		foret.genererRencontre();
		System.out.println(poule);
		

	}

}
