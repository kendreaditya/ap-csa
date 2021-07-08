import java.util.*;

public class ArrayListNotes {
	public static void main(String argsp[])
	{
		String test[] = {"Steve","Alex","Aditya"};			// Static
		int testInt[] = {2,1,3};							// Static
		
		// Declaration and Constructs a lists of strings
		ArrayList<String> names = new ArrayList<String>();	// Dynamic
		
		names.add("Steve");
		names.add("Alex");
		names.add("Aditya");
		System.out.println(names);
		
		for(int x=0;x<names.size();x++)
			System.out.println(names.get(x));
			
		for(String name : test)
			System.out.println(name);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1); nums.add(2);  nums.add(2); nums.add(3); nums.add(4);
		
		for(int x=0; x<nums.size();x++)
		{
			// System.out.println(nums.get(x)%2==0 ? nums.get(x): nums.remove(x));
			if(x < nums.length && nums[x] % 2 == 0)
			{
				System.out.println(nums[x] + " is even!");
			}
		}
		System.out.println(nums);
		
		/*
		* boolean 5 and | - identical to conditional (&& and ||)
		* except every statement is evaluated (no short circuit)
		* 
		* if(birthday==true & ++=age >= 21) -- does both
		* 
		* Logic negation (NOT) -- !
		* 	a statement which is true because false and vice versa
		* 
		* if(!(x>0)) would be the same as if (x<=0)
		* 
		* Exclusive OR (also known as XOR)
		* 	In OR, one or the other OR BOTH must be true
		* 	Using XOR. we drop the BOTH part - only of the 2 may be true
		*/
		
	}
}
