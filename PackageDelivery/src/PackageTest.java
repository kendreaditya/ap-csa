public class PackageTest {
 public static void main(String args[])
 {
  String name[] = new String[] {"Aditya", "Tiha"}, address[] = new String[] {"4 Winifield Dr", "10 Lonly Ln"}, city[] = new String[] {"Mechanicsburg", "Gettysburg"}, state[] = new String[] {"PA", "PA"} , zipCode[] = new String[] {"17050", "17325"};
  Package p1 = new Package();
  Package p2 = new Package(name, address, city, state, zipCode, 5, 1.5); 
  TwoDayPackage twoDay = new TwoDayPackage(5);
  OvernightPackage overnightDay = new OvernightPackage(7);
  
  System.out.println(p1.toString());
  System.out.println();
  System.out.println(p2.toString());
  System.out.println();
  System.out.println(twoDay.toString());
  System.out.println();
  System.out.println(overnightDay.toString());
 }
}
