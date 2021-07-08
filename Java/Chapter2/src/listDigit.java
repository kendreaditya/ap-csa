import java.util.Scanner;

public class listDigit {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		
		int lol1 = Integer.parseInt(num1);
		int lol2 = Integer.parseInt(num2);
		
		if(lol1 % 10 == lol2 % 10) System.out.print("Yes!");
		else System.out.print("No");

	}
}