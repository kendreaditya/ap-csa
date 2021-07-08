#include"Fraction.h"
#include<iostream>
using namespace std;

int main()
{

	Fraction f1(4,6);
	Fraction f2(-3, 5);

	Fraction sum = f1.addFraction(f2);
	Fraction sub = f1.subFraction(f2);
	Fraction mult = f1.multiFraction(f2);
	Fraction div = f1.diviFraction(f2);

	sum.printFraction();
	sub.printFraction();
	mult.printFraction();
	div.printFraction();


	return 0;
}