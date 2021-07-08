/* Aditya Kendre
 * Period 1
 * IntegerSet
 */

import java.util.*;

public class IntegerSet {
	private boolean[] numSet;
	public IntegerSet()
	{
		numSet = new boolean[101];
	}
	public IntegerSet union(IntegerSet arr)
	{
		IntegerSet returnArr = new IntegerSet();
		
		for(int x = 0; x < arr.numSet.length; x++)
		{
			if(arr.numSet[x] || numSet[x])
				returnArr.numSet[x] = true;
		}
		return returnArr;
	}
	public IntegerSet intersection(IntegerSet arr)
	{
		IntegerSet returnArr = new IntegerSet();

		for(int x = 0; x < arr.numSet.length; x++)
		{
			if(arr.numSet[x] == numSet[x])
				returnArr.numSet[x] = true;
		}
		return returnArr;
	}
	public void addNumber(int num)
	{
		numSet[num] = true;
	}
	public void removeNumber(int num)
	{
		numSet[num] = false;
	}
	public void printSet()
	{
		// Add , and space
	    ArrayList print = new ArrayList();		
		for(int n = 0; n < numSet.length; n++)
		{
			if(numSet[n])
				print.add(n);
		}
		System.out.print("{");
		System.out.print(print.toString().substring(1,print.toString().length()-1));
		System.out.println("}");
	}
	public boolean isEqualTo(IntegerSet numSet2)
	{
		for(int i = 0; i < numSet.length; i++)
			if(numSet[i] != numSet2.numSet[i])
				return false;
		return true;
	}

}
