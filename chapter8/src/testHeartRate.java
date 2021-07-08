public class testHeartRate {
	public static void main(String args[])
	{
		Date d1 = new Date(1,2,2003);
		HeartRates hr = new HeartRates("Aditya", "Kendre", d1);
		System.out.print(hr);
		
		HeartRates hr2[] = new HeartRates[5];
		
		for(int x = 0; x < hr2.length; x++)
		{
			hr2[x] = new HeartRates();
			System.out.println(hr2[x]);
			System.out.println("ID = "+hr2[x].getid());
			
		}
	}
}
