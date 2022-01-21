
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Persons p1 = new Persons();
		p1.name = "Anamitra";
		p1.walk();// select the method you can know which method is called
		p1.walk(5);

	}

}

class Persons {
	String name;

//Polymorphism means same named method with different argument type.
	void walk() {
		System.out.println(name + " is walking");
	}

	void walk(int step) {
		System.out.println(name + " is walking only " + step + " steps");
	}
}
