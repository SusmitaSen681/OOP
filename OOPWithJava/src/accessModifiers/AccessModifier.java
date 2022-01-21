package accessModifiers;

public class AccessModifier {

	public static void main(String[] args) {
		AccessModifier a1 = new AccessModifier();
		a1.worked();
		Students s1 = new Students("Anamitra");
		System.out.println(s1.studentName);

	}

	public void work()// we can access everything through public modifiers.It's also accessible in
						// another package and another class also.
	{
		System.out.println("Working whole day");
	}

	void works()// It's a default modifiers.It's only accessible in same package and another
				// same package's class .
	{
		System.out.println("Working ");
	}

	private void worked()// It's a private modifiers.It's only accessible in same class .
	{
		System.out.println("Working ");
	}

}

class Students extends School {

	Students(String name) {
		super(name);

	}

}

class School {
	protected String studentName;// protected modifiers is only accessible in their child class

	School(String name) {
		this.studentName = name;
	}
}
