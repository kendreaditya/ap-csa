import java.io.*; 
import java.util.*;

public class testTime {
	public static void main(String args[])
	{

		
		ArrayList<time1> times = new ArrayList<time1>();
		
		for(int m = 10; m <= 52; m++)
		{
			times.add(new time1(8,m,0));
		}
		System.out.print(times);

	}
}
