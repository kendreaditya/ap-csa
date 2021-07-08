
#pragma once
#ifndef COMPLEX_H
#define COMPLEX_H
#include<iostream>
using namespace std;

class Complex
{
	friend ostream &operator<<(ostream &, Complex &);

public:
	Complex(double = 0.0, double = 0.0);		// constructor
	Complex operator+(const Complex &) const;	// addition
	Complex operator-(const Complex &) const;	// subtraction
	Complex operator*(const Complex &) const;	// multiplication
	
	bool operator==(const Complex &) const;
	bool operator!=(const Complex &) const;
private:
	double real;		// real part
	double imaginary;	// imaginary part
	};					// end class Complex

#endif