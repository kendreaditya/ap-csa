package methods;

public class ConeVolume {
	public static void main(String args[])
	{
		System.out.print(volume(3,5));
	}
	private static double volume(double height, double radius)
	{
		return Math.PI*Math.pow(radius, 2)*(height/3);
	}
}
