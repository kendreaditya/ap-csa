import javax.swing.*;		// J stuff
import java.awt.*;			// Graphics

public class DrawPanelTest {
	public static void main(String args[])
	{
		DrawPannel1 dp1 = new DrawPannel1(new Color(123,3,43));
		JFrame form1 = new JFrame();
		
		form1.add(dp1);
		form1.setSize(700,700);
		form1.setVisible(true);
		
	}
}
