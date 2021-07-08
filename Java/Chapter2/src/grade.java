import java.util.Scanner;

public class grade {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String lol = input.nextLine();

		
	
		int a1 = Integer.parseInt(lol);
		if(a1 >= 93) System.out.print("A");
		else if (a1 >= 86) System.out.print("B");
		else if (a1 >= 78) System.out.print("c");
		else if (a1 >= 70) System.out.print("D");
		else System.out.print("F");
		
		

	}
}