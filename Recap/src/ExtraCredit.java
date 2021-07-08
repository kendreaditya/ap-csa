import java.util.*;
public class ExtraCredit {
	  	public static void printTriangle(int n) 
	    { int lol = 0;
	        for(int i=1; i<=n; i++) 
	        { 
	  	            for(int j=1; j<=i; j++) 
	            { 
	                System.out.print(j);
	                lol++;
	  	            if(lol == n)
	  	            	break;
	            }
	  	          if(lol == n)
	  	           	break;
	        }
	   }
	  	public static void printTriangleReal(int n) 
	    { 
	  		int lol = 0;
	        for(int i=1; i<=10000; i++) 
	        { 
	  	            for(int j=1; j<=i; j++) 
	            { 
	                System.out.print(j);
	                lol++;
	  	            if(lol == n)
	  	            	break;
	            } 
	  	            System.out.println();
	  	            if(lol == n)
	  	            	break;
	        }
	   } 
	  	    public static void main(String args[]) 
	    { 
	  	    Scanner input = new Scanner(System.in);
	  	    System.out.print("Input n: ");
	        int n = input.nextInt(); 
	        printTriangle(n);
	        System.out.println();
	        printTriangleReal(n);
	    }
}
