public class BoxTest {
  public static void main(String args[])
  {
    Box b1 = new Box(2, 4, 5);
    Box b2 = new Box();
    
    System.out.println(b1.isCube());
    System.out.println(b1.surfaceArea());
    System.out.println(b1.volume());
    System.out.println(b1.toString());
    System.out.println(b1.fits(b2));
  }
}