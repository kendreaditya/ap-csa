import java.util.*;
import javax.swing.*;

public class JavaInput {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double d1, d2;
		
		System.out.print("Enter first decimal: ");
		d1  = input.nextDouble();
		
		System.out.print("Enter second decimal: ");
		d2  = input.nextDouble();
		
		//System.out.println("The bigger number: %f \n The smaller number: %f", d1, d2);
		System.out.println("The bigger number:"+Math.max(d1, d2));

		// When you input numbers then strings than the enter to submit the value
		
		String temp = input.nextLine();
		
		String name;
		
		System.out.print("Please enter a name: ");
		name = input.nextLine();
		
		System.out.println("Your name is " + name);
		
		// We can also get input using inputDialog from JOptionPane
		
		double num1, num2;
		String sNum1;
		
		// input is a string
		sNum1 = JOptionPane.showInputDialog("Enter first decimal: ");
		
		// turn inputed string into a number
		num1 = Double.parseDouble(sNum1);
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second decimal: "));
		
		JOptionPane.showMessageDialog(null, "The sum is " + ((Double)(num1) + (Double)(num2)));
		
		// Icon Types - INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
		
		JOptionPane.showMessageDialog(null, "Happy Birthday", "Title", JOptionPane.WARNING_MESSAGE);
		
		// You may also create an optionDialong with button choices
		
		Object obj[]= {"Yes, Please!", "No, thank you!", "Other choice!"};
		
		int choice = JOptionPane.showOptionDialog(null, "Select an Option: ", "Cool", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, obj, obj[2]);
		
		if(choice == 0)
			System.out.println("You clicked yes!");
		else if(choice == 1)
			System.out.println("You clicked no!");
		else
			System.out.println("You clicked other!");
		
	}
}
