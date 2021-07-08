// Quick recap of Chapter 2

import java.util.*;
import javax.swing.*;

public class Chapter2 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		/*
		basic java output:
			- prinln - new line
			- print - same line
			- printf - formatted printing
				- %s (string)
				- %d (decimal)
				- %f (float)
		*/
		
		System.out.printf("PI is around %.2f \n", Math.PI);
		
		// Input - console input uses Scanner
		double cost, taxPercent;
		String itemName;
		
		System.out.print("Please enter the item's name: ");
		itemName = input.nextLine();
		
		System.out.print("Please enter the item's cost: ");
		cost = input.nextDouble();
		
		System.out.print("Please enter the sales tax percent: ");
		taxPercent = input.nextInt();
		
		double finalCost = cost + cost * ((double)taxPercent / 100.0);
		
		System.out.printf("You bought %s for $%.2f at %.2f percent tax = $%.2f", itemName, cost, taxPercent, finalCost);
		
		String sNum1 = JOptionPane.showInputDialog("Please enter a number: ");
		int num1 = Integer.parseInt(sNum1);
		
		JOptionPane.showMessageDialog(null, num1);
	}
}
