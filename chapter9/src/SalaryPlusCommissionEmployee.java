
public class SalaryPlusCommissionEmployee extends Employee{
	  // related set/get methods - only add in the new stuff
	  private double hoursWorked;
	  private double hourlyWage;
	  private double annualSalary;

	 
	  // Constructors are not inherited
	  public SalaryPlusCommissionEmployee()
	  {
	   
	  }
	  public SalaryPlusCommissionEmployee(String name, double hoursWorked, double hourlyWage, double annualSalary)
	  {
	   // The very first line of your constructor MUST be a call to the superclass
	    super(name); // <- Sends in name into the Employee constructor, you cannot acesss private variables in Employee
	    setHoursWorked(hoursWorked);
	    setHourlyWage(hourlyWage);
	    setAnnualSalary(annualSalary);
	  }
	  public void setAnnualSalary(double annualSalary)
	  {
		  this.annualSalary = annualSalary;
	  }
	  public double getAnnualSalary()
	  {
		  return annualSalary;
	  }
	  public double getHoursWorked()
	  {
		  return hoursWorked;
	  }
	  public double earnings()
	  {
		  return (super.earnings());
	  }
	  public void setHoursWorked(double hoursWorked)
	  {
	    this.hoursWorked = (hoursWorked >=0 && hoursWorked <= 168 ? hoursWorked : 0);
	  }
	  public void setHourlyWage(double hourlyWage)
	  {
	    this.hourlyWage = (hourlyWage >=0 ? hourlyWage : 0);
	  }
	  // We will finish the gets later
	  // because this file will also have a toString, it is overriding the previous class's toString
	  // However... we are going to make use of the previous toString by calling super.toString()
	  /*Computer Science – MP3 Extra Credit
Input a string of digits. Rearrange the digits in the string to build two nonnegative integers such that the sum of the two is as large as possible.
- Each of your new numbers must contain at least one digit.
- Leading zeros are not allowed, but the number zero consisting of a single digit 0 is allowed.
- You have to use each digit exactly as many times as it occurs in the given input string.
- The values will stay within the bounds of a 32-bit integer (2,147,483,647)
Examples:
001 will print 10
175 will print 76
21 will print 3
444444 will print 44448
(There will be many more super fun examples that I will*/
	  public String toString()
	  {
	   return super.toString() + "\n" + "Paycheck: $" + earnings() + "\nAnnual Salary: $" + getAnnualSalary();
	  }

}
