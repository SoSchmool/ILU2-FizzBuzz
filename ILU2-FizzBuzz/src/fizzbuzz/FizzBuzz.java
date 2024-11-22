package fizzbuzz;

public class FizzBuzz {
	
	public static Object fizzbuzz(int i) {
		if (i == 3) {
			return "fizz";
		}
		if (i==5) {
			return "buzz";
		}
		return Integer.toString(i);
	}

}
