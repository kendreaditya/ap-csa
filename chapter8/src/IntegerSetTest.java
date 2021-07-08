/* Aditya Kendre
 * Period 1
 * IntegerSetTest
 */

public class IntegerSetTest {
	public static void main(String args[])
	{
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet arr = new IntegerSet();
		int[] nums = {1,2,3,4,5,6,3,2,1,4,1,3,5,3,1,23,3,4,12,4,1,53,12,43,12,5,32,87,56,45,5,43,24,64,24,62,42,62,43,12,89,43,51,27,53,45,89,57,65,20};
		
		for(int x = 0; x <= 40; x++)
		{
			intSet1.addNumber((int)(Math.random()*100)+1);
			intSet2.addNumber(nums[x]);
			arr.addNumber((int)(Math.random()*100)+1);
		}
		
		intSet1.printSet();
		intSet2.printSet();
		arr.printSet();
		
		intSet1.union(arr).printSet();
		intSet1.intersection(arr).printSet();
		intSet1.addNumber(5);
		intSet1.addNumber(50);
		intSet1.addNumber(15);
		intSet1.removeNumber(15);
		intSet1.printSet();
		
	}

}
