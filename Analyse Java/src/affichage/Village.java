package affichage;

public class Village {
	private String nom;
	protected int nbHabitant;
	
	public class VillageGaulois extends Village{
		private int nbHuttes=0;
		private Hutte[] huttes = new Hutte[20];
		private Gaulois chef;
	}

}
