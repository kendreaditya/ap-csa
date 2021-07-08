import java.awt.*;
import javax.swing.*;

public class Simley extends JPanel {
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.black);
		g.fillOval(55, 55, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		g.setColor(Color.yellow);
		g.fillRoundRect(120, 100, 80, 80, 80, 80);
		g.fillRoundRect(20, 100, 80, 80, 80, 80);

	}
}
