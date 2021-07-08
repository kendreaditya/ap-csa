
public class palindrome {
	public static void main(String args[])
	{
		System.out.print(testPalindrome("hAnnah"));
	}
	public static boolean testPalindrome(String str)
	{	
		str = str.replaceAll("\\s","");
		str = str.toLowerCase();
		if(str.equals("")) return true;
		else if(str.charAt(0)==str.charAt(str.length()-1)) {
			return testPalindrome(str.substring(1,str.length()-1));}
		return false;
	}

}
