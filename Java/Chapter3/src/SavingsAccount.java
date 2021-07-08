public class SavingsAccount {
	double savingsBalance, annualInterestRate;
	
	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = (savingsBalance <= 0 ? 1 : savingsBalance);
	}
	
	public double calculateMonthlyInterest()
	{
		return this.savingsBalance*this.annualInterestRate/12;
	}
	
	public void modifyInterestRate(double new_annualInterestRate)
	{
		annualInterestRate = new_annualInterestRate;
	}
}
