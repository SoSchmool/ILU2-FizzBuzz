package fizzbuzz;

public class FizzBuzz {
	
	public static Object fizzbuzz(int i) {
		String resultat = "";
		if (i % 3 == 0) {
			resultat = resultat + "fizz";
		}
		if (i % 5 == 0) {
			resultat = resultat + "buzz";
		}
		if (resultat.equals("")){
			return Integer.toString(i);
		}else {
			return resultat;
		}
	}

}
