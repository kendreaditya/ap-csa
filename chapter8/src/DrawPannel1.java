import javax.swing.*;
import java.awt.*;


public class DrawPannel1 extends JPanel
{			
	public DrawPannel1(Color color)
	{
		setBackground(color);
	}
	
	public void leftStairs(Graphics g1, boolean isFilled, int size)
	{
		int y1 = 0, x1 = 0;
		for(int x = 0; x < size; x++)
		{
			x1 = 0;
			for(int y = 0; y <= x; y++)
			{
				g1.setColor(Color.black);
				if(isFilled)
					g1.fillRect(x1, y1, 50, 30);
				else
					g1.drawRect(x1, y1, 50, 30);
				x1 += 50;

			}
			y1 += 30;
		}
	}
	public void middleStairs(Graphics g1, boolean isFilled, int size)
	{
		// 25*(n-1)
		int startPos = 25*(size-1);
		int y1 = 0, x1 = startPos;
		for(int x = 0; x < size; x++)
		{
			for(int y = 0; y <= x; y++)
			{
				g1.setColor(Color.black);
				if(isFilled)
					g1.fillRect(x1, y1, 50, 30);
				else
					g1.drawRect(x1, y1, 50, 30);
				x1 += 50;
				
			}
			startPos -= 25;
			x1 = startPos;
			y1 += 30;
		}
	}
	
	public void paintComponent(Graphics g1)
	{
		boolean isFilled = false;
		int size = 50;
		super.paintComponent(g1);
		//leftStairs(g1, true, size);
		middleStairs(g1, isFilled, size);
		
	}
}
