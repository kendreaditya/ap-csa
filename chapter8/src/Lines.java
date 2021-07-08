import java.awt.*;

public class Lines {
	private int x1, y1, x2, y2;
	private Color color;
	
	public Lines(int x1, int y1, int x2, int y2, Color color)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color = color;
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
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
}
