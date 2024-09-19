package Cours1;

public class GestionTableau{
	
	private int[] tableau = {0,0,0,0,0};
	
	public void initCase(int indice, int nombre) {
		tableau[indice] = nombre;
	}
	
	public void lireCase(int indice) throws ArrayIndexOutOfBoundsException, ValeurNonInitialiseeException{
		if (indice < 0) {
			throw new ArrayIndexOutOfBoundsException("L'indice "+ indice + " est trop petit");
		}else if(indice > tableau.length -1) {
			throw new ArrayIndexOutOfBoundsException("L'indice "+ indice + " est trop grand");
		}
		if(tableau[indice] == 0) {
			throw new ValeurNonInitialiseeException("La valeur à l'indice " + indice + " n'est pas initialisée");
		}
		System.out.println("La valeur à l'indice " + indice + " est : "+ tableau[indice]);
		
	}
	
	public static void main(String[] args) {
		GestionTableau gestionTableau = new GestionTableau();
		gestionTableau.initCase(0, 5);
		gestionTableau.initCase(1, 2);
		gestionTableau.initCase(2, 4);
		try {
			gestionTableau.lireCase(0);
			gestionTableau.lireCase(-1);
			gestionTableau.lireCase(5);
			gestionTableau.lireCase(3);
		}catch(ArrayIndexOutOfBoundsException | ValeurNonInitialiseeException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fin de la lecture du tableau");
		}
		System.out.println("FIN");
	}

}
