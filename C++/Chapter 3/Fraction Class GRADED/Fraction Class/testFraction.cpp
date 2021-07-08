#include"Fraction.h"
#include<iostream>
using namespace std;

int main()
{

	Fraction f1(4,6);
	Fraction f2(3, 6);

	Fraction sum = f1 + f2;
	cout << sum << endl;

	Fraction diff = f1 - f2;
	cout << diff << endl;

	Fraction prod = f1 * f2;
	cout << prod << endl;

	if (f1 == f2) cout << "f1 is equal to f2" << endl;
	if (f1 != f2) cout << "f1 is not equal to f2" << endl;
	if (f1 <= f2) cout << "f1 is greater than or equal to f2" << endl;
	if (f1 >= f2) cout << "f1 is less than or equal to f2" << endl;
	if (f1 < f2) cout << "f1 is greater than to f2" << endl;
	if (f1 > f2) cout << "f1 is less than to f2" << endl;






	return 0;
}