public class SavaingsAccountTest {
	public static void main(String args[])
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		saver1.modifyInterestRate(0.04);
		saver2.modifyInterestRate(0.04);
		
		double s1 = saver1.calculateMonthlyInterest(), s2 = saver2.calculateMonthlyInterest();
		for(int x = 1; x <= 12; x++)
		{			
			System.out.println("Saver 1 Month: "+x+" Interst: "+s1+ " Balance: "+(saver1.savingsBalance-s1));
			System.out.println("Saver 2 Month: "+x+" Intrest: "+s2+ " Balance: "+(saver2.savingsBalance-s2));
			s1 += saver1.calculateMonthlyInterest();
			s2 += saver2.calculateMonthlyInterest();
		}
		
		System.out.println("-------------------------------------------");

		
		saver1.modifyInterestRate(0.05);
		saver2.modifyInterestRate(0.05);
		
		double s1v2 = saver1.calculateMonthlyInterest(), s2v2 = saver2.calculateMonthlyInterest();
		for(int x = 1; x <= 12; x++)
		{			
			System.out.println("Saver 1 Month: "+x+" Interst: "+s1v2+ " Balance: "+(saver1.savingsBalance-s1v2));
			System.out.println("Saver 2 Month: "+x+" Intrest: "+s2v2+ " Balance: "+(saver2.savingsBalance-s2v2));
			s1v2 += saver1.calculateMonthlyInterest();
			s2v2 += saver2.calculateMonthlyInterest();
		}
		
	}
}
