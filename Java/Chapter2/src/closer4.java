// Aditya Kendre
// 4/3/2019

import java.util.*;

public class closer4 {
	public static void main(String args[])
	{
		// We only use this line once in our code; declare an instance of Scanner
		Scanner input = new Scanner(System.in);
		
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		double diff1 = Double.parseDouble(num1) - 4;
		double diff2 = Double.parseDouble(num2) - 4;
		
		if(Math.abs(diff1) < Math.abs(diff2)) System.out.print(num1 + " is closer");
		else if(Math.abs(diff1) == Math.abs(diff2)) System.out.print("Equal");
		else System.out.print(num2 + " is closer");

	}
}