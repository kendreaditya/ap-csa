import java.util.*;
import javax.swing.*;

public class cubeRoot {
	public static void main(String args[])
	{
		
		double num1, num2;
		String sNum1;
		
		// input is a string
		sNum1 = JOptionPane.showInputDialog("Enter first decimal: ");
		
		// turn inputed string into a number
		num1 = Double.parseDouble(sNum1);
		
		JOptionPane.showMessageDialog(null, Math.cbrt(num1));
		
		
		
	}
}
