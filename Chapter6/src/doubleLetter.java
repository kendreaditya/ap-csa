import java.util.Vector;

public class doubleLetter {
	public static void main(String args[])
	{
		System.out.println(otherDoubleLetter("AAABA"));
	}
	public static String doubleLetter(String str)
	{
		str+=" ";
		Vector<String> strs = new Vector();
		for(int x = 0; x < str.length();x++)
		{
			for(int  y = x; y < str.length();y++)
			{
				if(str.charAt(x) != str.charAt(y))
				{
					strs.add(str.substring(x,y));
					x=y-1;
					break;
				}
			}
		}
		String finally_ = "";
		for(int x = 0; x < strs.size(); x++)
		{
			if(strs.get(x).length() != 2)
				finally_ += strs.get(x);
		}
		return finally_;
	}
	
	public static String otherDoubleLetter(String str)
	{
		for(int i = 0; i < str.length()-2; i++)
		{
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i) != str.charAt(i+2))
			{
				str = str.substring(0,i) + str.substring(i+1);
			}
		}
		return str;
	}
}
