import java.util.Scanner;

public class stringIntAverge {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		String string1 = input.nextLine();
		
		int lol1 = Integer.parseInt(num1);
		int lol2 = Integer.parseInt(num2);
		double avrg = (double)((double)lol1+(double)lol2)/2;
		
		if(string1.equals("sming")) System.out.print(string1+" "+Math.max(lol1,lol2));
		else System.out.print(string1+" "+avrg);

	}
}