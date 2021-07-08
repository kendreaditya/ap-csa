#pragma once

#ifndef POLYNOMIAL_H
#define POLYNOMIAL_H
#include<iostream>
using namespace std;
class Polynomial
{
	friend ostream &operator<<(ostream &, Polynomial &);

public:
	Polynomial();
	Polynomial(int[], int);

	Polynomial operator+(Polynomial &);
	Polynomial operator-(Polynomial &);
	Polynomial operator*(Polynomial &);
	Polynomial operator=(Polynomial &);


private:
	int coeff[11] = {0}, degree;
};

#endif // !POLYNOMIAL_H

