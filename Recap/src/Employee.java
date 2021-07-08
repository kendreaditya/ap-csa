public class Employee {
	private String firstName, lastName;
	private double salary;
	
	public Employee()
	{
	}
	public Employee(String firstName, String lastName, double salary)
	{
		setFiestName(firstName);
		setLastName(lastName);
		setSalary(salary);
	}
	
	public void setFiestName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary >= 0 ? salary : 0;
	}
	public double getSalary()
	{
		return this.salary;
	}

	
}
