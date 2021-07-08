// Complex number header file
// (9.5 on pg 411)
#pragma once

#ifndef COMPLEX_H
#define COMPLEX_H

class Complex
{
private:
	double real, imag;

public:
	Complex();
	Complex(double, double);

	void setReal(double);
	void setImag(double);

	double getReal();
	double getImag();

	void printComplex();

	// (3+2i) + (4-5i) = (7-3i)
	// c1 + c2 = sum
	// sum = c1.addComplex(c2)

	Complex addComplex(Complex);
	Complex subtractComplex(Complex);
};


#endif // !COMPLEX_H

