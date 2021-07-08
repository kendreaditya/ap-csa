
public class EmployeeDirver {
	public static void main(String args[])
	{
		Employee employee1 = new Employee("Hilly", "Bob", 41234);
		Employee employee2 = new Employee("Harris", "Collin", 54234);
		
		System.out.println(employee1.getFirstName()+" "+employee1.getLastName()+"'s salary is "+employee1.getSalary()+".");
		System.out.println(employee2.getFirstName()+" "+employee2.getLastName()+"'s salary is "+employee2.getSalary()+".");
		
		
		System.out.println("With a 10% raise "+employee1.getFirstName()+" "+employee1.getLastName()+"'s salary would be "+employee1.getSalary()*1.1);
		System.out.println("With a 10% raise "+employee2.getFirstName()+" "+employee2.getLastName()+"'s salary would be "+employee2.getSalary()*1.1);
	}

}
