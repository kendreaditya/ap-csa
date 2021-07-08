import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Draw_Line extends JPanel {
	private Lines[] lines;
	public Draw_Line()
	{
		setBackground(Color.BLACK);
		
		lines = new Lines[100000000];
		
		for(int tiha = 0; tiha<lines.length;tiha++)
		{
			int x1 = (int)(Math.random()*500);
			int y1 = (int)(Math.random()*500);
			int x2 = (int)(Math.random()*500);
			int y2 = (int)(Math.random()*500);
			
			int red = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			
			Color c = new Color(red, blue, green);
			
			lines[tiha] = new Lines(x1, y1, x2, y2, c);
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(Lines line : lines)
		{
			line.draw(g);
		}
	}
}
