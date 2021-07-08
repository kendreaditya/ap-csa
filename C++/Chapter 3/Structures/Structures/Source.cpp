#include<iostream>
using namespace std;

struct Rectangle
{
	int length, width;
};

struct Circle { int raduis, x, y; };

int area(Rectangle);
double area(Circle);

int main() 
{
	Rectangle r1;
	r1.length = 8;
	r1.width = 4;

	cout << "The area of the rectangle is " << area(r1) << endl;

	Circle c1;
	c1.raduis = 8;
	c1.x = 0;
	c1.y = 0;

	cout << "The area of the circle is " << area(c1) << endl;

	return 0;
}

int area(Rectangle r)
{
	return r.length * r.width;
}

double area(Circle c)
{
	return pow(c.raduis,2)*3.141592;
}