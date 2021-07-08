
#pragma once
#ifndef FRACTION_H
#define FRACTION_H
#include<iostream>
using namespace std;

class Fraction
{
	friend ostream &operator<<(ostream &, Fraction &);

public:
	Fraction(double = 0.0, double = 0.0);		// constructor
	Fraction operator+(const Fraction &) const;	// addition
	Fraction operator-(const Fraction &) const;	// subtraction
	Fraction operator*(const Fraction &) const;	// multiplication
	
	bool operator==(const Fraction &) const;
	bool operator!=(const Fraction &) const;
private:
	double real;		// real part
	double imaginary;	// imaginary part
	};					// end class Fraction

#endif