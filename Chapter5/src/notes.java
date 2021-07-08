/* Chapter 5 notes
 * Counter-controled repetition
 * 	Requires four pieces:
 * 		- A loop control variable (LCV)
 * 		  should be an integer, not float
 * 		- Initial value
 * 		- Loop continuation condition - loop as long as this is true, stops when it becomes false
 * 		- Step (increment/decrement)
 * For loops lend themselves best to counter-controlled/definite loop problems, whereas while loops lend themslves best
 * to sentinel/indefinite loop problem... although you may use either.
 * 
 * for-each is based on iterating through the list
 * 
 * Error: counter controlled loops and off my 1 error
 * 
 * for loops don't have to run (they does not through an error)
 *  
 */
public class notes {
	public static void Interst(double principle)
	{
		double n = 1000, amount = 0, rate = .03;
		for(int year = 1; year <= 30;year++)
		{
			amount = n * Math.pow(1+rate, year);
			System.out.printf("$%.2f \n",amount);
		}
	}
	public static void forLoops()
	{
		int x = 1;
		while(x <= 10)
		{
		System.out.print(x+" ");
		x++;
		}
		System.out.println();
		x -= 1;
		while(x >= 1)
			{
			System.out.print(x+" ");
			x--;
			}
			System.out.println();
			x = 0;
		while(x <= 100)
		{
			System.out.print(x+" ");
			x+=5;
		}
		System.out.println();
	}
	public static void nestedForLoop()
	{
		for(int r = 1;r<=10;r++)
		{
			for(int c = 1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void ArrayStuff()
	{
		int nums[] = {1,4,9,16,25,36,49,64,81,100};
		
		for(int x=0;x<nums.length;x++)
		{
			System.out.println((x+1)+"\t"+nums[x]);
		}
		
		// NEW!
		for(int num : nums)
		{
			System.out.println(num);
		}
	}
	public static void main(String args[])
	{ 
		//forLoops();
		//nestedForLoop();
		//ArrayStuff();
		
		
		int x = 1;
		for(int x=0;x<6;x++);
		{
			System.out.println(x);
		}
	}
}
