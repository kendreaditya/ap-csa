/*	Array
 *  - element: the contents of the array
 *  - index/subscirpt: the location of the element
*/
import java.util.*;

public class ArrayNotes {
	public static void main(String args[])
	{
		int nums[] = new int[10];
		
		String names[] = {"amy", "bem", "cathy"};
		
		fillArray(nums);
		
		print(nums);
	}
	private static void fillArray(int nums[])
	{
		for(int x=0; x < nums.length; x++)
		{
			nums[x] = (int)Math.random()*10;
		}
	}
	private static void print(int nums[])
	{
		for(int x=0; x < nums.length; x++)
		{
			System.out.print(nums[x]+" ");
		}
	}
}
