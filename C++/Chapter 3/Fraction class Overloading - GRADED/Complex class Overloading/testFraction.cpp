#include"Fraction.h"
#include<iostream>
using namespace std;

int main()
{
	Fraction c1(2, 3);
	Fraction c2(4, 5);

	Fraction sum = c1 + c2;
	cout << sum << endl;

	Fraction diff = c1 - c2;
	cout << diff << endl;

	Fraction prod = c1 * c2;
	cout << prod << endl;
}

