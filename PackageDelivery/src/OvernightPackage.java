public class OvernightPackage extends Package{
	private double feePerOZ;
	
	public OvernightPackage(double feePerOZ)
	{
		this.feePerOZ = (feePerOZ >= 0 ? feePerOZ: 0);

	}
	public double calculateCost()
	{
		return super.calculateCost()+(feePerOZ*getWeight());
	}
	public double getFeePerOZ()
	{
		return feePerOZ;
	}
	public String toString()
	{
		return super.toString()+"Fee Per OZ: "+Double.toString(feePerOZ)+"\nCost: "+Double.toString(calculateCost());
	}
	public void setFeePerOZ(double feePerOZ)
	{
		this.feePerOZ = (feePerOZ >= 0 ? feePerOZ: 0);
	}
}
