// Aditya Kendre
// Triangle Class
// 4/29/2019

public class Triangle {
 private double a, b, c;
 
 public Triangle()
 {
  this.a = 1;
  this.b = 1;
  this.c = 1;
 }

 public Triangle(double a, double b, double c)
 {
  this.a = (a <= 0 ? 1 : a);
  this.b = (b <= 0 ? 1 : b);
  this.c = (c <= 0 ? 1 : c);

  if(isTriangle() == false)
  {
   System.out.println("Come on, this is NOT a triangle!");
   a = 1;
   b = 1;
   c = 1;
  }
 }

 public boolean isRightTriangle()
 {
  if(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)) == c ||
    Math.sqrt(Math.pow(a, 2)+Math.pow(c, 2)) == b ||
    Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2)) == a)
    return true;
  else
    return false;
 }


 private boolean isTriangle()
 {
  if((a+b) > c && (a+c) > b && (b+c) > a)
    return true;
  else
    return false;
 }

 public double perimeter()
 {
  return a+b+c;
 }

 public double area()
 {
  double s = perimeter()/2.0;
  return Math.sqrt(s*(s-a)*(s-b)*(s-c));
 }

 public String toString()
 {
  if(a == b && c == b)
    return "Equilateral";
  else if(a != b && c != a && c != b)
    return "Scalene";
  else
    return "Isosceles";
 }

 public double getA()
 {
  return this.a;
 }

 public void setA(double newA)
 {
  this.a = (newA <= 0 ? 1 : newA);
 }

 public double getB()
 {
  return this.b;
 }

 public void setB(double newB)
 {
  this.b = (newB <= 0 ? 1 : newB);
 }

 public double getC()
 {
  return this.c;
 }

 public void setC(double newC)
 {
  this.c = (newC <= 0 ? 1 : newC);
 }

}
