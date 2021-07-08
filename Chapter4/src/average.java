import java.util.*;

public class average {
	public static void main(String args[])
	{
		double sum = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			sum += input.nextDouble();
		}
		System.out.println("The average: "+sum/10);
		
		double x = 0, sum1 = 0;
		while(x < 10)
		{
			sum1 += input.nextDouble();
			x++;
		}
		System.out.println("The average: "+sum1/10);

		double z = 0, sum2 = 0;
		do
		{
			sum2 += input.nextDouble();
			z++;
		} while(z <= 9);
		System.out.println("The average: "+sum2/10);

		
		
	}
}
