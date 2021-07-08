import java.util.Vector;

public class FactorFriends {
	public static void main(String args[])
	{	
		
		System.out.print(areFactorFriends(12,18));
	}

	private static boolean areFactorFriends(int a, int b)
	{
		int aCount = 0, bCount = 0;
		for(int x = 1; x < (int)a/2; x++)
		{
			if(a%x==0) aCount++;
		}
		
		for(int x = 1; x < (int)b/2; x++)
		{
			if(b%x==0) bCount++;
		}
		
		return aCount == bCount;
	}
}
