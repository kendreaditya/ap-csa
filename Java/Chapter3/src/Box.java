// Aditya Kendre
// Box Class
// 5-2-2019

public class Box{
 private double length, width, height;
 
 public Box()
 {
  length = 1;
  height = 1;
  width = 1;
 }
 
 public Box(double length, double width, double height)
 {
  this.length = (length >= 0 ? length : 1);
  this.width = (width >= 0 ? width : 1);
  this.height = (height >= 0 ? height : 1);
 }
 
 public boolean fits(Box b)
 {
   if(length > b.length && height > b.height && width > b.width) 
     return true;
   else
     return false;
 }
 
 public boolean isCube()
 {
   if(length == width && height == width) 
     return true;
   else
     return false;
 }
 
 public double surfaceArea()
 {
   return 2*((width*length)+(height*length)+(height*width));
 }
 
 public double volume()
 {
   return width*length*height;
 }
 
 public String toString()
 {
   return ("This box has a length of "+length+", a width of "+width+", and a height of "+height+
           " Its surface area is "+surfaceArea()+" and its volume is "+volume()+".");
 }
 
 public double getLength()
 {
  return length;
 }
 
 public void setLength(double newLength)
 {
  this.length = (newLength >= 0 ? newLength : 1);
 }
 
 public double getWidth()
 {
  return width;
 }
 
 public void setWidth(double newWidth)
 {
  this.width = (newWidth >= 0 ? newWidth : 1);
 }
 
 public double getHeight()
 {
  return height;
 }
 
 public void setHeight(double newHeight)
 {
  this.height = (newHeight >= 0 ? newHeight : 1);
 }
  
}