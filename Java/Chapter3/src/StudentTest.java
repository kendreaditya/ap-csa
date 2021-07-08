// This is the runnable file (driver file or the test file)

public class StudentTest {
	
	// A static method can be called without first creating an object of the class in which its declared
	
	public static void main(String args[])
	{
		// Create an object (instance) of the Student class; not the class (Student)
		Student s = new Student();
		
		s.setName("Tony Stark");
		
		s.printName();
		
		// Other methods are called from t class itself, like Math.sqrt or Integer.perseInt
		
		System.out.println(s);
		
		
	}
}
