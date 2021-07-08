
public class extraCredit {
	public static void main(String[] args) 
	{
	    System.out.println(idk(0,1));
	 }
	  public static int idk(int earth, int mars)
	  {
	    int count  = 0;
	    while(earth != 0 || mars != 0)
	    {
	      if(earth < 364) earth++;
	      else earth = 0;
	      if(mars < 686) mars++;
	      else mars = 0;
	      count++;
	
	    }

	    return count-1;
	  }

}
