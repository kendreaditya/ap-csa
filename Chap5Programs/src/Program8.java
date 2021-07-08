import java.util.Scanner;

public class Program8 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(), i = 1;
		
		for(int x = num-1; x >= 1; x--)
		{
			for(int y = 1; y <= x; y++)
				System.out.print(" ");
			for(int y = num-x; y >= 1; y--)
				System.out.print("*");
			for(int y = num-1-x; y >= 1; y--)
				System.out.print("*");
			for(int y = 1; y <= x; y++)
				System.out.print(" ");
			System.out.print("\n");
		}
		for(int y = 1; y <= num*2-1; y++)
			System.out.print("*");
		System.out.println();
		for(int x = 1; x <= num-1; x++)
		{
			for(int y = 1; y <= x; y++)
				System.out.print(" ");
			for(int y = num-x; y >= 1; y--)
				System.out.print("*");
			for(int y = num-1-x; y >= 1; y--)
				System.out.print("*");
			for(int y = 1; y <= x; y++)
				System.out.print(" ");
			System.out.print("\n");
		}
	}

}
