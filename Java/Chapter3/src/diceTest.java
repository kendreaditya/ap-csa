
public class diceTest {
	public static void main(String args[])
	{
		Dice d1 = new Dice();
		d1.setDiceSide(8);
		System.out.println(d1.getDiceSide());
		System.out.println(d1.roll());
		d1.roll(5);
		System.out.println(d1.toString());
		
		Dice d2 = new Dice(2);
		System.out.println(d2.getDiceSide());
		System.out.println(d2.roll());
		d2.roll(5);
		System.out.println(d2.toString());
		
	}
}
