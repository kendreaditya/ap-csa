import java.util.*;

public class Program3 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		float A = input.nextInt();
		float B = input.nextInt();
		float C = input.nextInt();
		
		float x = input.nextInt();
		float y = input.nextInt();
		
		float b = -((B/A*x)-y);
		System.out.print(b+" = "+(-B/A)+"x + y");
		
		
	}
}
