
//We used constructor for creating new object..Constructor name must same as class name.
public class Constructor {

	public static void main(String[] args) {
		Man p1=new Man();//Here,Man() is a default constructor
		p1.name="Anamitra Dawn";
		p1.eat();
		Man p2=new Man("Rimon",23);
		System.out.println(p2.name);
		p2.eat();

	}

}
class Man{
	String name;
	int age;
	public Man()
	{
		System.out.println("It's a default constructor");
	}
	public Man(String newName,int newAge)//Pramitarized Constructor 
	{
		name=newName;
		age=newAge;
	}
	
	 void eat()
	 {
		 System.out.println(name+" is eating");
	 }
}
