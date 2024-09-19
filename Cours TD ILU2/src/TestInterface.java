import java.util.Random;

public class TestInterface {

	public static void main(String[] args) {
		Monde desertSable = new Desert(200, "sable", "un scorpion");
		Monde desertPierre = new Desert(300, "terre aride", "un vautour");
		Monde foretSapin = new ForetInterface("Forêt des Griffes", "terrifiante", "un ours");
		Monde foretArbre = new ForetInterface("Foret des Hurlements", "sombre","un loup" );
		
		
		Monde[] mondes = {desertSable, desertPierre, foretSapin, foretArbre};
		Random rand = new Random();
		int numDecor = rand.nextInt(mondes.length);
		Monde decor = mondes[numDecor];
		/*System.out.println(decor.afficherDecors());
		System.out.println(decor.afficherDanger());*/
		
		Ecrivain ecrivain = new Ecrivain();
		ecrivain.decrireMonde(decor);
		
		

	}

}
