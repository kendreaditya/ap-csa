import java.awt.Color;

public class MyRectangle {
	private int x1, y1, x2, y2;
	private Color color;
	private boolean isFilled;
	public MyRectangle()
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		color = Color.BLACK;
		this.isFilled = false;
	}
	public MyRectangle(int x1,int y1,int x2,int y2)
	{
		setX1(x1);
		setY1(y1);
		setY2(y2);
		setX2(x2);
		setColor(Color.BLACK);
		setFilled(false);
	}
	public MyRectangle(int x1,int y1,int x2,int y2, Color c, boolean isFilled)
	{
		setX1(x1);
		setY1(y1);
		setY2(y2);
		setX2(x2);
		setColor(c);
		setFilled(isFilled);
	}
	public void setColor(Color c)
	{
		this.color = c;
	}
	public void setFilled(boolean isFilled)
	{
		this.isFilled = isFilled;
	}
	public void setX1(int x1)
	{
		this.x1 = (x1 >=0 ? x1 : 0);
	}
	public void setY1(int y1)
	{
		this.y1 = (y1 >=0 ? y1 : 0);
	}
	public void setY2(int y2)
	{
		this.y2 = (y2 >=0 ? y2 : 0);
	}
	public void setX2(int x2)
	{
		this.x2 = (x2 >=0 ? x2 : 0);
	}
	//
	public Color getColor()
	{
		return this.color;
	}
	public boolean getFilled()
	{
		return this.isFilled;
	}
	public int getX1()
	{
		return this.x1;
	}
	public int getY1()
	{
		return this.y1;
	}
	public int getY2()
	{
		return this.y2;
	}
	public int getX2()
	{
		return this.x2;
	}
	
	public int getUpperLeftX()
	{
		return Math.min(x1, x2);
	}
	public int getUpperLeftY()
	{
		return Math.min(y1, y2);
	}
	public int getWidth()
	{
		return Math.abs(x1-x2);
	}
	public int getHeight()
	{
		return Math.abs(y1-y2);
	}

}
