package association.missions;

public class Mission {
	private String nomMission;
	private int duree;
	private String description;
	
	public Mission(String nomMission, int duree, String description) {
		this.nomMission = nomMission;
		this.duree=duree; 
	}
	
	public void afficherMission() {
		System.out.println(this.nomMission + this.duree + this.description); 
	}
	
	
	
	

}
