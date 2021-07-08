
public class Program3 {
	public static void main(String args[])
	{
		for(int x = 1; x <= 10; x++)
		{
			for(int y = 1; y <= x; y++)
				System.out.print("*");
			for(int y = 12; y >= x; y--)
				System.out.print(" ");
			
			for(int y = 10; y >= x; y--)
				System.out.print("*");
			for(int y = 2; y <= x+2; y++)
				System.out.print(" ");
			
			for(int y = 1; y <= x; y++)
				System.out.print(" ");
			
			for(int y = 10; y >= x; y--)
				System.out.print("*");
			
			for(int y = 12; y >= x; y--)
				System.out.print(" ");
			
			for(int y = 1; y <= x; y++)
				System.out.print("*");

			System.out.println();
		}
	}
}
