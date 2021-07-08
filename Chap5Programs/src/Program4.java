
public class Program4 {
	public static void main(String args[])
	{
		double i = 3, sum = 4;
		for(int x = 1; x<=200000; x++)
		{
			if(x % 2 == 0)
				sum +=4.0/i;
			else
				sum -=4.0/i;
			i+=2;
		}
		System.out.println(sum);
	}
}
