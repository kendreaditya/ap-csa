import java.util.*;

public class Program10 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean idk = false;
		
		for(int x = 2; x <= num; x++)
		{
			idk = true;
			for(int y = 2; y < x; y++)
			{
				if(x % y == 0)
				{
					idk = false;
					break;
				}
			}
			if(idk)
				System.out.println(x);
		}
	}
}
