
public class time2 {
	protected int hour, minute, second;
	public time2(int h, int m, int s)
	{
		setTime(h,m,s);
	}
	public time2()
	{
		setTime(0,0,0);
	}
	public void setHour(int h)
	{
		hour = (h>=0 && h <=23) ? h : 0;
	}
	
	public int getHour(int h)
	{
		return hour;
	}
	
	public void setMinute(int m)
	{
		minute = (m>=0 && m<=59) ? m : 0;
	}
	
	public int getMinute(int m)
	{
		return minute;
	}
	
	public void setSecond(int s)
	{
		second = (s>=0 && s<=59) ? s : 0;
	}
	
	public int getSecond(int s)
	{
		return second;
	}
	
	public void setTime(int h, int m, int s)
	{
		setMinute(m);
		setSecond(s);
		setHour(h); 
	}
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12) ? "AM" : "PM");
	}
}
