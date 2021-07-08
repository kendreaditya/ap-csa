import java.util.*;

public class StringStuff {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String word1 = "apple", word2 = "apple", word3 = "APPLE", word4 = "banana";
		
		if(word1 == word2)
			System.out.println("world1 == world2");
		if(word1 == "apple")
			System.out.println("word1 == apple");
		
		String test = input.nextLine();
		
		// using == with strings won't work because string is an object
		if(word1 == test)
			System.out.println("u printed apple");
		
		// You have to do this
		if(word1.equals(test))
			System.out.println("u printed apple");
		
		// When using compareTo to see if its is in alphabetical order, negative values means first word is alphabetically positive value means first word is alphabetically after zero means the two words are equal
		
		if(word1.compareTo(test) < 0)
			System.out.println("u printed apple");
		
	}
}
