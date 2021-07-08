import java.util.*;
import javafx.application.*;
public class string {
	public static void main(String args[])
	{
		whatsItDo("WATCH");
	}
	public static void whatsItDo(String str)
	{
		int len = str.length();
		System.out.println(len);
		if(len > 1)
		{
			String temp = str.substring(0, len-1);
			System.out.println(temp);
			whatsItDo(temp);
			System.out.println(temp);
		}
	}
}
