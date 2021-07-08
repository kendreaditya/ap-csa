import java.util.Scanner;

public class middleNum {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		String a11 = input.nextLine();

		
	
		int a1 = Integer.parseInt(a11);
		int a2 = a1;
		int flag=0;

		while(a2>0)
		{
		    a2/=10;               //Moves to the left by one digit
		    if(a2==0)             //If there are odd no. of digits
		    {
		        flag=1;
		        break;
		    }
		    a2/=10;               //Moves to the left by one digit
		    a1/=10;               //Moves to the left by one digit
		}
		
		a1 = a1 % 10;
		
		if(a1/2 == 0) 
			System.out.print(a1);
		else System.out.print(a1*a1);

	}
}