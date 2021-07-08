import javax.swing.*;  

public class Program2 {
	public static void main(String args[])
	{
		String num1 = JOptionPane.showInputDialog(null, "Input the first number: ");
		String num2 = JOptionPane.showInputDialog(null, "Input the sencond number: ");
		JOptionPane.showMessageDialog(null,Integer.parseInt(num1) + Integer.parseInt(num2) +"\n"+num1+num2);
	}
}
