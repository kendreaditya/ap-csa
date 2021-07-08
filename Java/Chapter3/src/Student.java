// Chapter 3 - Intro (Redo) of Classes, Objects, Methods, Strings

// This is a non-runnable file (no main method)

public class Student
{
	// This is an attribute of the Student class
	private String name; // <------- attribute
	
	public void setName(String name)
	{
		// this.means class variable (only equal to not setting equal to another variable)
		this.name = name;
	}
	
	// This is a behavior of the Student class (method/function)
	public void printName()
	{
		System.out.println(name); // <------- behavior
	}
	
	public String toString()
	{
		return "name = " + name;
	}

}