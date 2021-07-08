/* Methods
 * 
 * THESE ARE NOT THE SAME THING
 * Subroutines - repeatable piece of code which is called by name
 * 		Functions - subroutine which returns a value based on inputs
 * 		Procedures - subroutine that does not return a value Ex: void functions 
 * 		Methods - function or a procedure which is called in the context of an object - since everything in Java is class based. "everything" is a method
 * 
 * To promote software reuse, every method should be limited to performing a single, well defined task. The name express that task. If you cannot choose a concise name that expresses the method's task, your
 * - Easier to debug
 * 
 * There are several included lobrary function Ex: min, max, floor
* For any class imported into your program, you can call the class's static methods by specifying the name of the
* Methods may only get around this - you may return a class object like Time, you may also return an array or a list
* 
* Variables should be declared as global variables/field variables if they're required for use in more than one method or if the program should save their values between calls to methods
* 	When we pass variables into methods, they are passed by value
* 		Pass by VALUE - no changes are kept -> make the variable global
* 		Pass by REFERENCE - changes to arrays or lists are kept
* 
* Declaring a method outside of the body of a class or inside the body of another method is a syntax error. Similarly, placing a semicolon at the end of a method's header is also a syntax error.
* 
*  Redeclaring a parameter as a local variable in a method is a compile error. Forgetting to return a value or returning the wrong type or returning from a void are all compile errors.
* 
* Java Scope Rules
* 	Scope - where a variable may be called by its name
* 	The scope of a paramenter is the body of the method in which the declaration appears
* 	
* 	The scope of a local varaible which appears in the header of the a for loop, is the body of that for loop
* 	Used to keep changes to certian variables
* 
* 	GLOBAL variables - the body if the entire class
*	
*	Pass by value - sending in a copy, the changes are kept
*	Pass by reference - changes are kept
*
*	Method Overloading:
*	
*	When you have 2 or more methods with the same name but with difference parameter lists.They may not only differ in the ret
* 
 */


import java.util.*;

public class notes {

	public static void main(String args[])
	{
		if(isEven(4))
			System.out.print("Your number is even!");
		System.out.print(max(5,3,6));
		
		ArrayList nums = new ArrayList<Integer>();
		
		for(int x = 0;x<10;x++)
			nums.add(x);
		
		ArrayList<Integer> evens = justEvens(nums);
		for(int e: evens)
			System.out.print(e);
		
	}
	private static 
	private static ArrayList<Integer> justEvens(ArrayList<Integer> a)
	{
		ArrayList temp = new ArrayList<Integer>();
		for(int num : a)
			if(isEven(num))
				temp.add(num);
		
		return temp; 
	}
	public static boolean isEven(int n)
	{
		if(n%2 == 0)
			return true;
		else
			return false;
	}
	public static int max(int a, int b, int c)
	{
		return Math.max(a, Math.max(b, c));
	}
}
