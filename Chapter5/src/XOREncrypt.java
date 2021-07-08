
public class XOREncrypt {
	public static void main(String args[])
	{
		String s = "Sming is aswesome!";
		String encrypt = code(s);
		System.out.println(encrypt);
		
		System.out.println(code(encrypt));
	}
	
	public static String code(String input)
	{
		char key = '-';
		String output = "";
		
		for(int x = 0; x<input.length();x++)
		{
			output += Character.toString((char)(input.charAt(x)^key));
		}
		return output;
	}
}
