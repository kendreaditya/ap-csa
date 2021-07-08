import javax.swing.*;

public class Test_Draw {
	public static void main(String args[])
	{
		Draw_Line p = new Draw_Line();
		JFrame form1 = new JFrame();
		form1.add(p);
		form1.setSize(500, 500);
		form1.setVisible(true);
	}
}
