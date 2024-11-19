package cours2;

public class A {
	private String aEnglobante = "a";
	private ClasseInterneA ciA = new ClasseInterneA();
	
	private class ClasseInterneA{
		private String aInterne = "aInterne";
		
		private String description() {
			return "ClasseInterneA : " + aInterne + " " + aEnglobante;
		}
	}
	
	public void descriptionClasseA() {
		System.out.println("Classe A:" + ciA.description());
	}

}

public static void main(String[] args) {
	A a = new A();
	a.descriptionClasseA();
	ClasseInterneA ciA = new ClasseInterneA();
}
