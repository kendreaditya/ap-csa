// Test file, called driver

#include"Triangle.h"
#include<iostream>
using namespace std;

int main()
{
	Triangle r1;

	r1.setA(3);
	r1.setB(4);
	r1.setC(5);
	r1.printTriangle();
	r1.printType();
	cout << r1.triangleArea() << endl;
	cout << r1.trianglePerimeter() << endl;

	cout << endl;

	// Bad numbers
	r1.setA(-4);
	r1.setB(8);
	r1.setC(1);
	r1.printTriangle();
	r1.printType();
	cout << r1.triangleArea() << endl;
	cout << r1.trianglePerimeter() << endl;

	cout << endl;

	return 0;

}