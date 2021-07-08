
public class countBinary {
	public static void main(String args[])
	{
		int num = 4;
		System.out.println(countBinary(num+2));	}
	public static int countBinary(int n)
	{
		if(n<=1)
			return n;
		return countBinary(n-1)+countBinary(n-2);
	}
}
