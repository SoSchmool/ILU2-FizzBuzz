package jeu.basique;

public class Journal {
	String message;
	
	public String ajouterMessage(String texte) {
		message = message + texte;
		return message;
	}
	
	public void afficherMessage() {
		System.out.println(message);
		message = "";
	}
}
