
  
public class Jacobsthal{ 
    public static void main(String argc[]){ 
    	int[] lol = new int[21]; 
    	double sum = 0;
    	  
        lol[0] = 0; 
        lol[1] = 1; 
  
        for (int i = 2; i <= 20; i++) 
            lol[i] = lol[i-1]+2*lol[i-2];
        
        for (int i = 1; i <= 20; i++) 
            sum += 1.0/lol[i];
        
        System.out.println(sum);
    } 
} 