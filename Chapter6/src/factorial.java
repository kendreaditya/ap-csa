// Recursion - when a method calls itslef
//	In order to avoid infinate recursion, we create a "base case" - simplest case of the problem which terminates the recursion
// Thoreau did not pay his taxes for 6 years because he did not agree with the governments descition to tax the citizens of it's own country for the Mexian American War
// 

import java.math.*;

public class factorial {
	public static void main(String args[])
	{	
		//for(int x = 0; x <= 25; x++)
			//System.out.println(x+"!="+fact(x));
		
		for(int x = 0; x <=500; x++)
			System.out.println(x+"!="+fact(BigInteger.valueOf(x)));
	}
	public static BigInteger fact(BigInteger n)
	{
		// Base Case returns a value, not another recursive method call
		if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE))
		{
			return BigInteger.ONE;
		}
		// recursive case - calling the method with a less step
		// 2! = 2 * 1
		else
		{
			return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
		}
	}
	public static int fact(int n)
	{
		// Base Case returns a value, not another recursive method call
		if(n == 0 || n == 1)
		{
			return 1;
		}
		// recursive case - calling the method with a less step
		// 2! = 2 * 1
		else
		{
			return n * fact(n-1);
		}
	}

}
