

public class extraCredit {
	static boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void main(String args[])
	{
		int count = 0, max= 1;
		for(int a = -1000; a <= 1000; a++)
		{
			for(int b = -1000; b <= 1000; b++)
			{
				for(int n = 0; n < 1000000; n++)
				{
					int q = (n*n)+(a*n)+b;
					if(isPrime(Math.abs(q)))
						count++;
					else
					{
						if(count > max)
						{
							max = count;
							System.out.print(count);
							System.out.print("\t");
							System.out.print(a);
							System.out.print("\t");
							System.out.print(b);
							System.out.print("\t");
							System.out.print(a*b);
							System.out.println();
						}
						
						count = 0;
						break;
					}
				}
					
			}
		}
	}

}
