
public class GCD {
	public static void main(String args[])
	{
		System.out.println(gcd(50, 100));
	}
	public static int gcd(int x, int y)
	{
		if(y == 0)
			return x;
		return gcd(y,x%y);
		
	}
}
