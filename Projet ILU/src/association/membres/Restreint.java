package association.membres;

import association.missions.Mission;

public class Restreint extends CM{
	private int nbClés;
	
	public Restreint(String nom, int motivation, boolean clé, Mission responsable) {
		super(nom, motivation, clé, responsable);
	}
	
	public void donnerClé(Actif actif) {
		if (nbClés <= 0) {
			System.out.println("Il n'y a plus de clés");
		}else {
			actif.recevoirClé();
		}
	}
	
	public void evaluerMotivation(Associatif membre) {
		if (membre.getMotivation() >= 50) {
			System.out.println(this.getNom() + " : " + "Continue comme ça !");
			membre.plusMotivé();
		}else {
			System.out.println(this.getNom() + " : " + "Il va falloir être plus investi !");
			membre.moinsMotivé();
		}
		/*if(membre.getMotivation() == 0) {*/
			
		
	}

}
