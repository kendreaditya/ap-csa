package methods;
import java.util.Random;

public class RandomString {
	public static void main(String argsp[])
	{
		System.out.print(roundString(5));
	}
	private static String roundString(int x)
	{
		Random r = new Random();
		String output = "";
		for(int i = 0; i  < x; i++) output+= Character.toString((char) (r.nextInt((90 - 65) + 1) + 65));
		return output;
	}
}
