
public class HeartRates {
	private String first_name, last_name; 
	private Date birthday;
	private int id = 0;
	private static int count = 0;
	public HeartRates()
	{
		this.birthday = new Date();

		setFirstName("Tiha");
		setLastName("Monawar");
		setBirthday(birthday.getMonth(), birthday.getDay(), birthday.getYear());
		id = count++;

		
	}
	public HeartRates(String first_name, String last_name, Date birthday)
	{
		this.birthday = new Date();

		setFirstName(first_name);
		setLastName(last_name);
		setBirthday(birthday.getMonth(), birthday.getDay(), birthday.getYear());
		id = ++count;
	}
	public void setFirstName(String first_name)
	{
		this.first_name = first_name;
	}
	public void setLastName(String last_name)
	{
		this.last_name = last_name;
	}
	public void setBirthday(int month, int day, int year)
	{
		birthday.setDay(day);
		birthday.setMonth(month);
		birthday.setYear(year);
	}
	public String getLastName()
	{
		return last_name;
	}
	public String getFristName()
	{
		return first_name;
	}
	public Date getDate()
	{
		return birthday;
	}
	public int getid()
	{
		return id;
	}
	public int findAge()
	{
		String time = java.time.LocalDate.now().toString();
		int year = Integer.parseInt(time.substring(0,4));
		int month = Integer.parseInt(time.substring(5,7));
		if(month >= birthday.getMonth())
			year++;
		return year - birthday.getYear() - 1;
	}
	public int maxHeartRate()
	{
		return 220-findAge();
	}
	public String targetHeartRate()
	{
		return String.format("%f - %f ", maxHeartRate()*.55, maxHeartRate()*.85); 
	}
	public String toString()
	{
		return String.format("Age: %d, Max Heart Rate: %d, Target Hear Rate: %s", findAge(), maxHeartRate(),targetHeartRate()); 
	}
}
