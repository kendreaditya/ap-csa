public class Program2 {
	public static void main(String args[])
	{
		long fact = 1;
		for(int x = 1; x <= 20; x++)
		{
			for(int i = 1; i <= x; i++)
			{
				fact *=i;
			}
			System.out.println(x+"\t"+fact);
			fact = 1;
		}
	}
}
