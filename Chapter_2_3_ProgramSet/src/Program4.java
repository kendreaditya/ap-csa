
public class Program4 {
	public static void main(String args[])
	{
	//int houseNumber,String street,String apartmentNumber,String city,String state,int postalCode)
	Address add1 = new Address(12, "Godlet", "Harrisburg", "PA", 17050);
	Address add2 = new Address(6, "Farro"," 34" ,"Mechanicsburg", "PA", 17055);
	add1.printAddress();
	add2.printAddress();
	if(add1.compareTo(add2.postalCode) == 0)
		System.out.println("They are the same");
	else if(add1.compareTo(add2.postalCode) > 0)
		System.out.println("Address 1 comes before");
	else if(add1.compareTo(add2.postalCode) < 0)
		System.out.println("Address 2 comes before");
	}
}
