
#include"Fraction.h"
#include<iostream>
using namespace std;

// Constructor
Fraction::Fraction(double realPart, double imaginaryPart)
: real(realPart), imaginary(imaginaryPart)		
{
	// empty body
}// end Fraction constructor

// addition operator
Fraction Fraction::operator+(const Fraction &operand2) const
{
	return Fraction(real + operand2.real, imaginary + operand2.imaginary);
} // end function operator+

// subtraction operator
Fraction Fraction::operator-(const Fraction &operand2) const
{
	return Fraction(real - operand2.real, imaginary - operand2.imaginary);
} // end function operator-

Fraction Fraction::operator*(const Fraction &operand2) const
{
	return Fraction(real * operand2.real - imaginary * operand2.imaginary, real * operand2.imaginary + imaginary * operand2.real);
} // end function operator-

 // display a Fraction object in the form: (a, b)
ostream &operator<<(ostream &output, Fraction &c)
{
	output << '(' << c.real << ", " << c.imaginary << ')';
	return output;
} // end function print

bool Fraction::operator==(const Fraction &operand2) const
{
	if (real == operand2.real && imaginary == operand2.imaginary) return true;
	else return false;
}

bool Fraction::operator!=(const Fraction &operand2) const
{
	if (real != operand2.real && imaginary != operand2.imaginary) return true;
	else return false;
}