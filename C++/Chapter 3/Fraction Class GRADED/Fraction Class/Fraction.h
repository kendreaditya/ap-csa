#pragma once

#ifndef FRACTION_H
#define FRACTION_H
#include<iostream>
using namespace std;
class Fraction
{
	friend ostream &operator<<(ostream &, Fraction &);

public:

	Fraction(int = 0, int = 1);

	void setNum(int);
	int getNum();
	void setDem(int);
	int getDem();
	
	Fraction operator+(const Fraction &);
	Fraction operator-(const Fraction &);
	Fraction operator*(const Fraction &);
	Fraction operator/(const Fraction &);

	bool operator==(Fraction &);
	bool operator!=(Fraction &);
	bool operator<=(Fraction &);
	bool operator>=(Fraction &);
	bool operator<(Fraction &);
	bool operator>(Fraction &);

private:
	int num = 0, dem = 1;
};

#endif // !FRACTION_H
