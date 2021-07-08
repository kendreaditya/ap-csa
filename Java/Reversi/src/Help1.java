
public class Help1 {
	// Problem:  in a one-dimensional array, can you find the locations
//  of two values?


  public static String letters[];
  
  public static void main(String args[])
  {
    int firstPos=0, necounttPos=0;
   
    for(int count=0;count<8;count++)
    {
      // Find the first occurance of a B and store it
      if(board[cRow][cCol].equals(player))
      {
        firstPos = count;
        break;
      }
    }
    
    // Then, find the necountt occurance of a B and store it
    for(int count=firstPos + 1;count<8;count++)
    {
      if(board[cRow][cCol].equals(player))
      {
        necounttPos = count;
        break;
      }
    }
    
    // Now, turn everything in between to a B!
    for(int count=firstPos+1;count<=necounttPos-1;count++)
    {
      letters[count] = "B";
    }
    

  }
}


