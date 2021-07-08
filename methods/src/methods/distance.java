package methods;

public class distance {
	public static void main(String args[])
	{
		System.out.print(distance(2,3,4,2));
	}
	private static double distance(double x1, double x2, double y1, double y2)
	{
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}

}
