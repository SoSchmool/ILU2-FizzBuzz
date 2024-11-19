package Histoire;

import Histoire.classic.Commercant;
import Histoire.combattant.Samourai;
import Histoire.combattant.Traitre;
import Histoire.mafia.Yakuza;
import Histoire.special.GrandMere;

public class MonHistoire {

	public static void main(String[] args) {
		Commercant hum1 = new Commercant(150, "Café", "Phillippe");
		Yakuza hum2 = new Yakuza(200, "Saké", "Mikey", "Tokyo Manji", 0);
		Samourai hum3 = new Samourai(300, "Jus d'orange", "Zoro", "Luffy-dono");
		Traitre hum4 = new Traitre(500, "Mirinda", "Kanjuro", "Orochi", 0);
		GrandMere hum5 = new GrandMere(100,"tisane", "Mami Jojo");
		hum1.ajouterArgent(200);
		System.out.println(hum1.getArgent());
		hum1.perdreArgent(50);
		System.out.println(hum1.getArgent());
		hum1.direBonjour();
		hum1.boire();
		hum2.extorquer(hum1);
		hum2.boire();
		hum2.direBonjour();
		hum3.direBonjour();
		hum3.boire("Saké");
		hum3.boire();
		hum4.direBonjour();
		hum4.FaireLeGentil(hum2, 50);
		hum5.faireConnaissance(hum2);
		hum5.ragoter();
		hum5.faireConnaissance(hum4);
		hum5.ragoter();
		
	}

}
