#pragma once

#ifndef FRACTION_H
#define FRACTION_H

class Fraction
{
public:
	Fraction();
	Fraction(int, int);

	void setNum(int);
	int getNum();
	void setDem(int);
	int getDem();

	Fraction addFraction(Fraction);
	Fraction subFraction(Fraction);
	Fraction multiFraction(Fraction);
	Fraction diviFraction(Fraction);

	void printFraction();


private:
	int num, dem = 1;
};

#endif // !FRACTION_H

