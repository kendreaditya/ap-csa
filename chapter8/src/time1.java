
public class time1 {
	private int hour, minute, second;
	public time1(int h, int m, int s)
	{
		setTime(h,m,s);
	}
	public void setTime(int h, int m, int s)
	{
		if(h>=0 && h <=23 && m>=0 && m<=59 && s>=0 && s<= 59)
		{
			hour = h;
			minute = m;
			second = s;
		}
		else
		{	
			
			throw new IllegalArgumentException("Invaid time");
		}
	}
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12) ? "AM" : "PM");
	}
}
