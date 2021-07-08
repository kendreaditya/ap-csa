import java.util.Scanner;

public class threeNumAdd {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		String num3 = input.nextLine();
		
		int lol1 = Integer.parseInt(num1);
		int lol2 = Integer.parseInt(num2);
		int lol3 = Integer.parseInt(num3);
		
		if(lol1 + lol2 == lol3 || lol1 + lol3 == lol2 || lol3 + lol2 == lol1) System.out.print("YES!");
		else System.out.print("No!");

	}
}