public class triangleTest {
 public static void main(String args[])
 {
  Triangle t1 = new Triangle();
  Triangle t2 = new Triangle(2, 2, 2);
  if(t1.isRightTriangle() == true) System.out.println("Triangle t1 is a right triangle");
  else System.out.println("Triangle t1 is NOT a right triangle");
  
  System.out.println("Triangle t1 perimeter: "+t1.perimeter());
  System.out.println("Triangle t1 area: "+t1.area());
  System.out.println(t1.toString());
  
  if(t2.isRightTriangle() == true) System.out.println("Triangle t2 is a right triangle");
  else System.out.println("Triangle t2 is NOT a right triangle");
  
  System.out.println("Triangle t2 perimeter: "+t2.perimeter());
  System.out.println("Triangle t2 area: "+t2.area());
  System.out.println(t2.toString());
  
  
 }
}
