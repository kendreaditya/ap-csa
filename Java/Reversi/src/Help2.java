
public class Help2 {
	// Up, Up-Right, Right, Down-Right, Down, Down-Left, Left, Up-Left (8 dirs)
	  public static int h[]= {0, 1, 1, 1, 0, -1, -1, -1};
	  public static int v[]= {-1, -1, 0, 1, 1, 1, 0, -1}, p[] = {1, -1};
	  
	  public static void main(String args[])
	  {
	    int currentRow = 4;
	    int currentCol = 4;
	    
	    for(int x = 0; x < 8; x++)
	    {
	    
	    	while(currentRow >= 0 && currentCol >= 0 && currentRow <=7 && currentCol <=7)
	    {
	      System.out.println(currentRow + " n " + currentCol);
	      currentRow +=v[x];
	      currentCol +=h[x];

	    }
	    
	    
	    // Now, let's go up to the right!
	    // (reset current position first)
	    currentRow = 4;
	    currentCol = 4;
	    while(currentRow >= 0 && currentCol >= 0 
	             && currentRow <=7 && currentCol <=7)
	    {
	      System.out.println(currentRow + "\t" + currentCol);
	      currentRow +=v[x];
	      currentCol +=h[x];

	    }
	    
	    
	  }
	  }
}
