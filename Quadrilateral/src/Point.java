public class Point
{
private double x;
private double y;

public Point()
{
	//double x = 0;
	//double y = 0;
}
public Point(double x, double y){
this.x = x;
this.y = y;
}
public double getX() {
return x;
}
public double getY() {
return y;
}
public void setPoint(double x, double y) {
x = (x < 0)? x : 0;
y = (y < 0 )? y : 0;
}
public String toString(){
return x + "," + y;
}
public void print(){
System.out.print("(" + x + "," + y + ")");
}
public void copy(Point otherPoint) {
x = otherPoint.x;
y = otherPoint.y;
}
public Point getCopy() {
return new Point(x,y);
}
public boolean equals(Object obj) {
if (obj instanceof Point) {
Point otherPoint = (Point) obj;
return x == otherPoint.x && y == otherPoint.y;
}
else{
return false;
}
}
public double distanceFromOrigin(){
return distance(new Point(0,0));
}
public double distance(Point otherPoint){
double dx = otherPoint.x - x;
double dy = otherPoint.y - y;
return Math.sqrt((dx * dx) + (dy * dy));
}
public void translate(double dx, double dy){
x += dx;
y += dy;
}
public boolean isHorizontal(Point otherPoint){
return otherPoint.y == y;
}
public boolean isVertical(Point otherPoint){
return otherPoint.x == x;
}
public double Slope(double dx, double dy){
return dy/dx;
}
}