
public class Address {
	int houseNumber, postalCode;
	String street, city, state, apartmentNumber = "";
	
	public Address(int houseNumber,String street,String apartmentNumber,String city,String state,int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.apartmentNumber = apartmentNumber;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public Address(int houseNumber,String street,String city,String state,int postalCode)
	{
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public Address()
	{
		
	}
	
	public void printAddress()
	{
		System.out.println(houseNumber +" "+street + apartmentNumber);
		System.out.println(city+", "+state+" "+postalCode);
	}
	public int compareTo(int postCode)
	{
		return String.valueOf(postCode).compareTo(String.valueOf(postalCode));
	}
}
