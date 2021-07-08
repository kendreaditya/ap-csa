// Aditya Kendre
// 4/3/2019

import java.util.*;

public class inputOutput {
	public static void main(String args[])
	{
		// We only use this line once in our code; declare an instance of Scanner
		Scanner input = new Scanner(System.in);
		
		
		// Does when using printf
		// %f - floating point numbers (decimals - float/double)
		//	%.xf - x number of digits of accuracy
		//	%,.xf - x number of digits with commas
		// %s - strings
		//	%S - capitalized string
		// %d - whole numbers (short, int, long)
		
		String first = "Anne", last = "Smith";
		int salary = 52000;
		double gpa = 89.123;
		
		System.out.printf("%s, %S earns $%d and has a GPA of %.2f", last, first, salary, gpa);
		System.out.println(first+ " " + last + " is awesome");
		
		int n1, n2;
		
		System.out.print("Enter the first number: ");
		n1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		n2 = input.nextInt();

		int sum = n1 + n2;
		System.out.println(sum);
		System.out.println(n1 - n2);
		
		System.out.println((double)n1 / (double)n2);
		System.out.println(Math.toDegrees(Math.PI/6));
		
	}
}