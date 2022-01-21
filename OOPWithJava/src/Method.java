import java.util.Scanner;

public class Method {

	public static void main(String[] args) {

		Pet a1 = new Pet();
		System.out.println("Enter your pet name: ");
		Scanner sc = new Scanner(System.in);
		a1.name = sc.nextLine();
		a1.eat();

		Pet a2 = new Pet();
		System.out.println("Enter your pet name: ");
		a2.name = sc.nextLine();
		a2.walk();
	}

}

class Pet {
	String name;// properties

	void eat()// Behavior
	{
		System.out.println(name + " is eating.");
	}

	void walk() {
		System.out.println(name + " is walking");
	}
}
