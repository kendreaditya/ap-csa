// Fig. 11.15:. Complex.cpp
// Complex class member-function definitions.
#include"Complex.h" // Complex class definition
#include<iostream>
using namespace std;

// Constructor
Complex::Complex(double realPart, double imaginaryPart)
: real(realPart), imaginary(imaginaryPart)					// real = realPart; imaginary = imaginaryPart;
{
	// empty body
}// end Complex constructor

// addition operator
Complex Complex::operator+(const Complex &operand2) const
{
	return Complex(real + operand2.real, imaginary + operand2.imaginary);
} // end function operator+

// subtraction operator
Complex Complex::operator-(const Complex &operand2) const
{
	return Complex(real - operand2.real, imaginary - operand2.imaginary);
} // end function operator-

Complex Complex::operator*(const Complex &operand2) const
{
	return Complex(real * operand2.real - imaginary * operand2.imaginary, real * operand2.imaginary + imaginary * operand2.real);
} // end function operator-

 // display a Complex object in the form: (a, b)
ostream &operator<<(ostream &output, Complex &c)
{
	output << '(' << c.real << ", " << c.imaginary << ')';
	return output;
} // end function print

bool Complex::operator==(const Complex &operand2) const
{
	if (real == operand2.real && imaginary == operand2.imaginary) return true;
	else return false;
}

bool Complex::operator!=(const Complex &operand2) const
{
	if (real != operand2.real && imaginary != operand2.imaginary) return true;
	else return false;
}
//9. Heinous Adj.hatefully or shockingly evil Syn : Horrid
//10. Impeccable Adj.Faultless; Without sin or blemish.Syn: Sinless
//11. Impound V.To confine; To retain in legal custody.Syn: Confiscate Ant : Release
//12. Inane Adj.Without sense or meaning; silly Ant : Significant
//13. Magnanimous Adj.Noble; Generous in forgiving; Free from petty feelings or acts.Syn: Generous Ant : Petty
//14. Sere Adj.Dry and Withered.Syn : Desiccated Ant : Lush
//15. Unctuous Adj.Exaggeratedly or insincerely polite.Ant : Genuine