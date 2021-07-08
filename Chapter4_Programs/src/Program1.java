import java.util.*;

public class Program1 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble(), i = 1;
		
		double sum = 0;
		
		while(i <= n)
		{
			sum += 1/i;
		
			i++;
		}
		
		double sum1 = 0;
		i = 1;
		while(n >= i)
		{
			sum1 += 1/n;

			n--;
			
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum-sum1);
	}
}
