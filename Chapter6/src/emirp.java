
public class emirp {
	public static void main(String args[])
	{
		System.out.println(emirp(57));
	}
	public static boolean emirp(int num)
	{
		int mun = Integer.parseInt(Integer.toString(num%10) + Integer.toString((int)num/10));
		 
		for(int x = 2; x < (int)num/2; x++)
			if(num%x==0) return false;
		
		for(int x = 2; x < (int)mun/2; x++)
			if(mun%x==0) return false;

		return true;
	}
}
