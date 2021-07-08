public class TwoDayPackage extends Package{
	private double flatFee;
	public TwoDayPackage(double flatFee)
	{
		this.flatFee = (flatFee >= 0 ? flatFee: 0);
	}
	public double calculateCost()
	{
		return super.calculateCost()+flatFee;
	}
	public double getFlatFee()
	{
		return flatFee;
	}
	public String toString()
	{
		return super.toString()+"Flate Fee: "+Double.toString(flatFee)+"\nCost: "+Double.toString(calculateCost());
	}
	public void setFlatFee(double flatFee)
	{
		this.flatFee = (flatFee >= 0 ? flatFee: 0);
	}

}
