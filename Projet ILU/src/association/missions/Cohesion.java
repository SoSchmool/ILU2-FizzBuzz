package association.missions;

import association.membres.CM;

public class Cohesion {
	private CM respo;
	private Mission[] missions_cohe;
	
	public Cohesion(CM respo) {
		this.respo=respo;
	}
	
	public void afficherRespo() {
		System.out.println(this.respo);
	}
	
	public void ajouterMission(Mission mission) {
		for(int i=0; i < missions_cohe.length; i++) {
			if (missions_cohe[i] == null) {
				missions_cohe[i]=mission;
			}
		}	
	}
	
	public void afficherMissionCohe(){
		for(int i=0; i < missions_cohe.length; i++) {
			missions_cohe[i].afficherMission();
		}
	}
	
	
}
