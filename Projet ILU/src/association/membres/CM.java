package association.membres;
import association.missions.*;


public class CM extends Actif{
	private Mission responsable;
	
	public CM (String nom, int motivation, boolean clé, Mission responsable) {
		super(nom, motivation, clé);
		this.responsable=responsable;
	}
	
	public void afficherMissionCM() {
		responsable.afficherMission();
	}
	
	
	

}
