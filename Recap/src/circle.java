import java.util.*;

public class circle {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		System.out.printf("Diameter: %.2f \nCircumference: %.2f \nArea: %.2f", 2*r, 2*Math.PI*r, Math.PI*r*r);
		
	}
}
