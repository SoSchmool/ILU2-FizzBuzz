package hagraland;

import arme.Arme;

public class HistoryHagrah {

	public static void main(String[] args) {
		Pelo p1 = new Pelo("Bienvenue", 50);
		Arme hache = new Arme(100, 75, 5, 40);
		Arme epee = new Arme(100, 100, 10, 20);
		Viking v1 = new Viking("Ragnar", 250, "Fjord", hache);
		Viking v2 = new Viking("Ivar", 300, "Valhalla", hache);
		System.out.println(p1.getNom());
		v1.attaquer(p1);
		v2.attaquer(p1);
		p1.direBonjour();
		v1.direBonjour();
		v1.provoquer();

	}

}
