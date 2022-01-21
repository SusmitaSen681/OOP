
public class ThisKeyword {

	public static void main(String[] args) {

		Animals a1 = new Animals();
		a1.name = "Tommy";
		System.out.println(a1.name);
		Animals a2 = new Animals("Kitty");
		a2.eat();
		System.out.println("Only " + Animals.count + " animals are created");
	}

}

class Animals {
	String name;
	static int count;//when you use static you have not need to create a object for using it.

	public Animals() {
		count++;
	}

	public Animals(String name) {
		this();//this keyword is used for accessing another constructor in same class..
		this.name = name;//here this keyword is used for accessing the current class's properties
	}

	void eat() {
		System.out.println(name + " is eating");
	}
}
