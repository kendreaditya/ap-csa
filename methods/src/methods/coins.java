package methods;

public class coins {
	public static void main(String args[])
	{
		coins(.99);
	}
	private static void coins(double cents)
	{
		double[] coin = {.25, .10, .05, .01};
		String[] coinName = {" quarters ", " dimes ", " nickels ", " pennies"};
		for(int i = 0; i < 4; i++)
		{
			int amount = (int)(cents/coin[i]);
			System.out.print(amount +coinName[i]);
			cents -= amount*coin[i];
			cents+=0.001;
		}
		
	}

}
