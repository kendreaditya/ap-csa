public class Package {
	// [sender inforamtion, reciver information]
	private String name[], address[], city[], state[], zipCode[];
	private double weight, costPerOZ;
	public Package()
	{
		this.name = new String[] {"Bob", "Dylan Ross"};
		this.address = new String[] {"4 Woods Dr.", "8 June ln"};
		this.city = new String[] {"Mechanicsburg", "Harrisburg"};
		this.state = new String[] {"PA", "PA"};
		this.zipCode = new String[] {"17050", "17055"};
		this.weight = 5.0;
		this.costPerOZ = 5.0;
	}
	public Package(String name[], String address[], String city[], String state[], String zipCode[], double weight, double costPerOZ)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.weight = (weight > 0 ? weight: 0);
		this.costPerOZ = (costPerOZ >= 0 ? costPerOZ: 0);
	}
	public double getWeight()
	{
		return weight;
	}
	public double getCostPerOZ()
	{
		return costPerOZ;
	}
	public double calculateCost()
	{
		return weight*costPerOZ;
	}
	public String getSenderName()
	{
		return name[0];
	}
	public String getReciverName()
	{
		return name[1];
	}
	public String getSenderAddress()
	{
		return address[0];
	}
	public String getReciverAddress()
	{
		return address[1];
	}
	public String getSenderCity()
	{
		return city[0];
	}
	public String getReciverCity()
	{
		return city[1];
	}
	public String getSenderState()
	{
		return state[0];
	}
	public String getReciverState()
	{
		return state[1];
	}
	public String getSenderZipCode()
	{
		return zipCode[0];
	}
	public String getReciverZipCode()
	{
		return zipCode[1];
	}
	public String toString()
	{
		return "Sender Information: \n"+getSenderName()+"\n"+getSenderAddress()+"\n"+getSenderCity()+", "+getSenderState()+" "+getSenderZipCode()+
				"\nReciver Information:\n"+getReciverName()+"\n"+getReciverAddress()+"\n"+getReciverCity()+", "+getReciverState()+" "+getReciverZipCode()+
				"\nWeight: "+Double.toString(weight)+"\nCost Pesr OZ: "+Double.toString(costPerOZ);
	}
	

}
