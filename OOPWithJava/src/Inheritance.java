import accessModifiers.AccessModifier;

public class Inheritance {

	public static void main(String[] args) {
		AccessModifier a1=new AccessModifier();
		a1.work();
		
		Human h2 = new Human("Rimon");
		h2.walk();
		Developer d1 = new Developer("Susmita");
		d1.eat();
		d1.walk();
		HR h1 = new HR("Anamitra");
		h1.eat();

	}

}

//Multilevel Inheritance
class HR extends Developer {

	public HR(String name) {
		super(name);

	}

	void eat() {
		System.out.println(name + " is eating Burger");
	}

}

//Single Inheritance
class Developer extends Human {
	public Developer(String name) {
		super(name);// super keyword is used to refer immediate parent class object.
	}

	void walk()// It's a runtime polymorphism
	{
		System.out.println("Developer " + name + " is walking");
	}
}

class Human {
	String name;

	public Human(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void walk() {
		System.out.println(name + " is walking");
	}
}
