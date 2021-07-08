
public class Program5 {
	public static void main(String args[])
	{
		for(int x = 1; x <= 500; x++)
		{
			for(int y = 1; y <= 500; y++)
				for(int z = 1; z <= 500; z++)
				{
					if(Math.pow(x*x+y*y,.5) == z)
					{
						System.out.println(x+"\t"+y+"\t"+Math.pow(x*x+y*y,.5));
					}
				}
	
		}
	}
}
