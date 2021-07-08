
public class APLine {
	
	private int a,b,c;
	
	public APLine(int a, int b, int c)
	{
		this.a = (a == 0 ? 1 : a);
		this.b = (b == 0 ? 1 : b); 
		this.c = c;
	}
	
	public double getSlope()
	{
		return -(double)a/b;
	}
	
	public boolean isOnLine(int x, int y)
	{
		return (a*x + b*y + c == 0);
	}
}
