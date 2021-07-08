package methods;

public class haszero {
	public static void main(String args[])
	{
		System.out.print(hasZero(10));
	}
	private static boolean hasZero(int x)
	{
		String num = Integer.toString(x);
		return num.indexOf("0")!=-1; 
	}
}
