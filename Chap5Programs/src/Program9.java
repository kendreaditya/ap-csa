
public class Program9 {
	public static void main(String args[])
	{
		int sum = 0;
		for(int x = 1; x <= 10000; x++)
		{
			for(int y = 1; y < x; y++)
			{
				if(x % y == 0)
					sum+=y;
			}
			if(x == sum)
				System.out.println(x);
			sum = 0;
		}
	}
}
