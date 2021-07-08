
public class Overloading {
	public static void main(String args[])
	{
		bar(5);
		bar(10, 'S');
		bar(3, "String");
		
	}
	
	public static void bar(int x)
	{
		bar(x,'*');
	}
	public static void bar(int x, char sym)
	{
		bar(x,""+sym);
	}
	public static void bar(int x, String str)
	{
		for(int n=1;n<=x;n++)
			System.out.print(str);
		System.out.println();
	}
}
