import java.util.*;
public class Program11 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Put a number in: ");
		int num = input.nextInt(), total = 0;
		
		String spaces = "";
		
		System.out.println("*");
		if(!(num == 1))
		for(int x = 1; x < num; x++)
		{
			if((total++ < num))
			{
			for(int y = 1; y < num; y++)
			{
				System.out.print(spaces);
				System.out.println("*");
			}
			}

			System.out.print(spaces);
			if((total++ < num))
			{
			for(int y = 1; y <= num; y++)
			{
				System.out.print("*");
			}
			}
			System.out.println();
			for(int y = 1; y < num; y++)
			{
				spaces += " ";
			}
		
		}
	}
		
	}


