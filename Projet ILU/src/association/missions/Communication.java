package association.missions;

import association.membres.CM;

public class Communication {
	private CM respo;
	private Mission[] missions_comm;
	
	public Communication(CM respo) {
		this.respo=respo;
	}
	
	public void afficherRespo() {
		System.out.println(this.respo);
	}
	
	public void ajouterMission(Mission mission) {
		for(int i=0; i < missions_comm.length; i++) {
			if (missions_comm[i] == null) {
				missions_comm[i]=mission;
			}
		}
		
	}
	
	public void afficherMissionComm(){
		for(int i=0; i < missions_comm.length; i++) {
			missions_comm[i].afficherMission();
		}
	}
}
