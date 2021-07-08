
public class Date {
	private int day, month, year;
	
	private int days_of_month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date()
	{
		setMonth(1);
		setDay(1);
		
		setYear(2000);
	}
	
	public Date(int month, int day, int year)
	{
		setMonth(month);
		setDay(day);
		
		setYear(year);
	}
	
	public void setDay(int day)
	{
		if(days_of_month[month] >= day) //|| (day == 29 && getMonth() == 2 && (getYear()%4 == 0 || getYear()%100 == 0)))
			this.day = day;
		else
		{
			this.day = 1;
			throw new IllegalArgumentException("Invaid day");
		}
			
	}
	public void setMonth(int month)
	{
		if(month <= 12 && month > 0)
			this.month = month;
		else
		{
			this.month = 1;
			throw new IllegalArgumentException("Invaid month");
		}
	}
	public void setYear(int year)
	{
		if(year >= 1753)
			this.year = year;
		else
		{
			this.year = 2020;
			throw new IllegalArgumentException("Invaid year");
		}
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return String.format("%02d/%02d/%04d", month, day, year); 
	}
	
}
