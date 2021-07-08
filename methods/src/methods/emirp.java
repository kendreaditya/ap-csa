package methods;

public class emirp {
	public static void main(String args[])
	{
		System.out.print(emrip(37));
	}
	private static boolean emrip(int n)
	{  
		if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
	int r = n % 10;
	int y = (int)n/10;
	n =  Integer.parseInt(Integer.toString(r)+Integer.toString(y));
	if (n <= 1) 
        return false; 

    // Check from 2 to n-1 
    for (int i = 2; i < n; i++) 
        if (n % i == 0) 
            return false; 

    return true; 
	}
}