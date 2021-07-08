
public class APQ {
	public static void changer(String x, int y)
	{
		x += "peace";
		y *= 2;
	}
	public static void main()
	{
		String s = "world";
		int n = 6;
		changer(s,n);
		System.out.print(s);
		System.out.print(n);
	}
}
