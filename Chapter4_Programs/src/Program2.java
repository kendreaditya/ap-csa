
public class Program2 {
	
	public static void main(String args[])
	{
		int i = 1;
		
		while(i<=110)
		{
			if(i%5==0 & i%7==0 & i%3==0)
			{
				System.out.print("SmingBlingPing ");
			}
			else if(i%5==0 & i%3==0)
			{
				System.out.print("SmingBling ");
			}
			else if(i%5==0 & i%7==0)
			{
				System.out.print("BlingPing ");
			}
			else if(i%3==0 & i%7==0)
			{
				System.out.print("SmingPing ");
			}
			else if(i%3==0)
			{
				System.out.print("Sming ");
			}
			else if(i%5==0)
			{
				System.out.print("Bling ");
			}
			else if(i%7==0)
			{
				System.out.print("Ping ");
			}
			
			else
				System.out.print(i+" ");
				
			if(i % 11 == 0)
			{
				System.out.println();
			}
			i++;
		}
		
			
			
			
		}
		
	}

