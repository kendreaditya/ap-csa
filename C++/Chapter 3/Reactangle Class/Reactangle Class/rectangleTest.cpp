// Test file, called driver

#include"Reactangle.h"
#include<iostream>
using namespace std;

void main()
{
	Rectangle r1;
	r1.printRectangle();

	// Let's try the set functions, change the length and width
	r1.setLength(4);
	r1.setWidth(8);
	r1.printRectangle();
	cout << endl;

	// Bad numbers
	r1.setLength(-4);
	r1.setWidth(0);
	r1.printRectangle();
	cout << endl;

	// Test the get functions
	if (r1.getLength() > r1.getLength())
		cout << "The length is longer than the width" << endl;

	Rectangle r2(8, 5);
	r2.printRectangle();
	cout << "The area of the rectangle is " << r2.rectangleArea() << endl;
	cout << "The perimeter of the rectagle is " << r2.rectanglePerimeter() << endl;


}