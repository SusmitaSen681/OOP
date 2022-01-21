//In a java program you can only create a public class but you can create many class and objects.
public class SampleClassObject {

	public static void main(String[] args) {
		// we create p1, a real time object through person class
		Person p1 = new Person();// new keyword is used for creating new thing
		p1.name = "Susmita Sen";
		p1.age = 21;
		System.out.println(p1.name);
		System.out.println(p1.age);
		// we create p2, another real time object through person class
		Person p2 = new Person();
		p2.name = "Anamitra Dawn";
		p2.age = 23;
		System.out.println(p2.name);
		System.out.println(p2.age);

	}

}

//This is a class which is called blueprint..
class Person {
	String name;//properties
	int age;//properties

}
