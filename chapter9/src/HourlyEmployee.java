// Subclass of Employee - HourlyEmployee

public class HourlyEmployee extends Employee
{
 // Because we inherit from Employee, we do not add name or any of its
  // related set/get methods - only add in the new stuff
  private double hoursWorked;
  private double hourlyWage;
 
  // Constructors are not inherited
  public HourlyEmployee()
  {
   
  }
  public HourlyEmployee(String name, double hoursWorked, double hourlyWage)
  {
   // The very first line of your constructor MUST be a call to the superclass
    super(name); // <- Sends in name into the Employee constructor, you cannot acesss private variables in Employee
    setHoursWorked(hoursWorked);
    setHourlyWage(hourlyWage);
  }
  public double getHoursWorked()
  {
	  return hoursWorked;
  }
  public double earnings()
  {
	  return (hourlyWage * hoursWorked);
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
  public String toString()
  {
   return super.toString() + "\n" + "Paycheck: $" + earnings() + "\n";
  }
}