public class EmployeeTest {
	public static void main(String args[])
	{
		Employee e = new Employee("Babu Frick");
		System.out.println(e);
		
		HourlyEmployee he = new HourlyEmployee("Rohan Bibba", 59, 34);
		System.out.println(he);
		
		SalaryEmployee se = new SalaryEmployee("Aditya Kendre", 54, 25, 5000);
		System.out.println(se);
		
		System.out.print(e.getClass().getName());
		
		String digits = "001"; 
		int b_num1, b_num2, max = 0;
		for(int x = 1; x < digits.length(); x++)
			for(int y = x; y < digits.length(); x++)
			{
				
				int num1 = Integer.parseInt(digits.substring(0,x));
				int num2 = Integer.parseInt(digits.substring(x,y));
				
				if(num1 + num2 >= max)
				{
					max = num1 + num2;
					b_num1 = num1;
					b_num2 = num2;
				}
				
			}
		System.out.print(max);
	}
}
