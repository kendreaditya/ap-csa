import java.util.*;

public class Program1 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		
		for(int x = 0; x < num.length()-1; x++)
		{
			System.out.print((int)(Integer.parseInt(num.substring(x, x+1))*Math.pow(10,num.length()-1-x))+ "+");
		}
		System.out.print((int)Integer.parseInt(num.substring(num.length()-1)));
	}
}
