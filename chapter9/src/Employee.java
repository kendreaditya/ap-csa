public class Employee
{
 private String name;
 
 public Employee()
 {
   name = "Sming";
 }
 public Employee(String name)
 {
  setName(name);
 }
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name = name;
 }
 public String toString()
 {
   return "Name: " + name;
 }
 public double earnings()
 {
	  return 5;
}
}