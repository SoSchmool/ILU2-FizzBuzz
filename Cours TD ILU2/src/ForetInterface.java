
public class ForetInterface implements Monde{
	private String nomForet;
	private String caracteristique;
	private String animal;
	
	public ForetInterface(String nomForet, String caracteristique, String animal) {
		this.nomForet = nomForet;
		this.caracteristique = caracteristique;
		this.animal = animal;
	}
	
	@Override
	public String afficherDecors() {
		return "Nous sommes dans la " + nomForet + ", une " +
				caracteristique + " et dangereuse forêt";
	}
	
	@Override
	public String afficherDanger() {
		return "Dans l'ombre, " + animal + " rôde";
	}

}
