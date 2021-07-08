#pragma once

#ifndef TRIANGLE_H
#define TRIANGLE_H
class Triangle
{

private:
	int a, b, c;

public:

	Triangle();
	Triangle(int, int, int);

	void setA(int);
	int getA();
	void setB(int);
	int getB();
	void setC(int);
	int getC();

	void printTriangle();

	double trianglePerimeter();
	double triangleArea();
	void printType();

	
};

#endif // !TRIANGLE_H
