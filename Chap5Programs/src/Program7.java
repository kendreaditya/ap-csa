import java.util.*;

public class Program7 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(), i = 1;
		
		for(int x = 1; x <= num; x++)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
			
		}
	}
}
