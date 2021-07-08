public class outOfBounds {

	public static void main(String args[])
	{
		int responses[] = {2, 4, 5, 5, 2, 3, 1, 4, 5, 10, 4, 3, 2, 3, 5};
		int freq[] = new int[6]; //hold 1-5
		
		int count = 0;
		for(int response: responses)
		{
			try
			{
				freq[response]++;
				responses[count] = response;
				count++;
				
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		float mean = 0, mode = 0;
		
		for(int num:freq)
		{
			mean += num;
			if(mode < num)
				mode = num;
		}
		System.out.println((float)mean/responses.length);
		System.out.println(mode);
		
		System.out.println(mode(freq));
		System.out.println(max(responses));
		System.out.println(min(responses));
		System.out.println(median(freq, responses));

		
		
	}
	private static int[] filterArray(int[] arr)
	{
		int tempArray[] = new int[arr.length];
				
		for(int num:arr)
			if(arr[x] <= 5 && arr[x] >= 1)
				tempArray[x] = arr[x]
				
		//vout = vin (r2/(r1 + r2))
		// t = (A + B*ln(((5*R)-(R*vout))/vout) + C*ln(((5*R)-(R*vout))/vout)^3)^-1
	}
	private static int mode(int[] freq)
	{
		int mode = 0;
		
		for(int num : freq)
		{
			if(num > mode)
				mode = num;
		}
		return mode;
	}
	
	private static int max(int[] responses)
	{
		int max = 0;
		
		for(int num : responses)
		{
			if(num > max)
				max = num;
		}
		return max;
	}
	
	private static int min(int[] responses)
	{
		int min = 6;
		
		for(int num : responses)
		{
			if(num < min)
				min = num;
		}
		return min;
	}
	
	private static double median(int[] freq, int[] resp)
	{
		int responses[] = new int[resp.length];
		for(int i = 0; i < freq.length; i++)
		{
			for(int x = 0; x < freq[i]; x++)
				responses[i+x] = responses[i];
		}
		
		return responses.length % 2 == 0 ? (responses[(int)responses.length/2]+responses[-1+(int)responses.length/2])/2.0:responses[responses.length/2];
	}
}
