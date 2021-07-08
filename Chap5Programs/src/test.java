import java.util.*;
public class test {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Put a number in! ");
		int num = input.nextInt();
		
		if(num == 1)
		{
			System.out.println("*");
		}
		else if(num == 2)
		{
			System.out.println("*\r\n" + 
					"**");
		}
		else if(num == 3)
		{
			System.out.println("*\r\n" + 
					"*\r\n" + 
					"***\r\n" + 
					"  *\r\n" + 
					"  *");
		}
		else if(num == 4)
		{
			System.out.println("*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"****\r\n" + 
					"   *\r\n" + 
					"   *\r\n" + 
					"   *\r\n" + 
					"   ****");
		}
		else if(num == 5)
		{
			System.out.println("*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*****\r\n" + 
					"    *\r\n" + 
					"    *\r\n" + 
					"    *\r\n" + 
					"    *\r\n" + 
					"    *****\r\n" + 
					"        *\r\n" + 
					"        *\r\n" + 
					"        *\r\n" + 
					"        *\r\n" + 
					"        ");
		}
		else if(num == 6)
		{
			System.out.println("*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"******\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     ******\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          ******");
		}
		else
		{
			System.out.println("*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"*\r\n" + 
					"******\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     *\r\n" + 
					"     ******\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          *\r\n" + 
					"          ******\r\n" + 
					"               *\r\n" + 
					"               *\r\n" + 
					"               *\r\n" + 
					"               *\r\n" + 
					"               *\r\n" + 
					"               ******\r\n" + 
					"                    *\r\n" + 
					"                    *\r\n" + 
					"                    *\r\n" + 
					"                    *\r\n" + 
					"                    *\r\n" + 
					"                    ******");
		}
	}
}
