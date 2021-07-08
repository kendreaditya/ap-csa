// Complex implementation file

#include"Complex.h"
#include<iostream>
using namespace std;

Complex::Complex()
{
	real, imag = 0;
}
Complex::Complex(double r, double i)
{
	real = r;
	imag = i;
}
void Complex::setReal(double r)
{
	real = r;
}
void Complex::setImag(double i)
{
	imag = i;
}
double Complex::getReal()
{
	return real;
}
double Complex::getImag()
{
	return imag;
}
void Complex::printComplex()
{
	// (2, 3) = (real #, imaganry #)

	cout << "(" << real << ", " << imag << ")" << endl;
}
Complex Complex::addComplex(Complex right) // right of the plus sign ((3+2i) + (4-5i) = (7-3i))
{
	return Complex(real + right.real, imag + right.imag);
}
Complex Complex::subtractComplex(Complex right)
{
	return Complex(real - right.real, imag - right.imag);
}

Complex Complex::multiComplex(Complex right) // right of the plus sign ((3+2i) + (4-5i) = (7-3i))
{
	return Complex(real + right.real, imag + right.imag);
}
Complex Complex::subtractComplex(Complex right)
{
	return Complex(real - right.real, imag - right.imag);
}