import java.util.*;

public class splittingNumbers {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String num = input.nextLine();
		
		for(int x = 0; x < num.length(); x++)
		{
			System.out.print(num.substring(x, x+1)+ " ");
		}
		
	}
}
