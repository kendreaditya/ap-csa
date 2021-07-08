#include"Polynomial.h"
#include<iostream>
using namespace std;

int main()
{
	// 3x^2 + 7x - 5

	// store it backs wards
	int coeff1[3] = { -5, 7, 3 };
	int coeff2[4] = { 10, 5, 4, 2 };
	Polynomial p1(coeff1, 2);
	Polynomial p2(coeff2, 3);

	Polynomial sum = p1 + p2;
	cout << "Sum: " << sum << endl;

	Polynomial diff = p1 - p2;
	cout << "Diff: " << diff << endl;

	Polynomial equal = p1 = p2;
	cout << "Equal: " << equal << endl;

   Polynomial prod = p1 * p2;
	cout << "Prod: " << prod << endl;




	return 0;
}