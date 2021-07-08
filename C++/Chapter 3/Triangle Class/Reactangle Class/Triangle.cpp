
#include"Triangle.h" 
#include<algorithm>
#include<iostream>
using namespace std;



Triangle::Triangle()
{
	a, b, c = 1;
}

Triangle::Triangle(int a2, int b2, int c2)
{
	if (a2 <= 0) a = 1;
	else a = a2;
	if (b2 <= 0) a = 1;
	else b = b2;
	if (c2 <= 0) a = 1;
	else c = c2;
}

void Triangle::setA(int a2)
{
	if (a2 <= 0) a = 1;
	else a = a2;
}

void Triangle::setB(int b2)
{
	if (b2 <= 0) b = 1;
	else b = b2;
}

void Triangle::setC(int c2)
{
	if (c2 <= 0) c = 1;
	else c = c2;
}

int Triangle::getA()
{
	return a;
}

int Triangle::getB()
{
	return b;
}

int Triangle::getC()
{
	return c;
}

void Triangle::printTriangle()
{
	cout << "Side B is " << a << endl << "Side B is " << b << endl << "Side C is " << c << endl;
}

double Triangle::trianglePerimeter()
{
	return a + b + c;
}


double Triangle::triangleArea()
{
	double s = (a + b + c) / 2;

	return sqrt(s*(s - a)*(s - b)*(s - c));
}


void Triangle::printType()
{
	int cSide = max(a, max(b, c));

	if (a == b && c == b && c == a) cout << "This is a Equalatral Triangle" << endl;
	else if (a != b && a!=c && b != c) cout << "This is a Scalene Triangle" << endl;
	else cout << "This is a iso Triangle" << endl;
}
