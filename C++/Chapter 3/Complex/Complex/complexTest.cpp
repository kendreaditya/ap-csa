// Complex number test file

#include"Complex.h"
#include<iostream>
using namespace std;

void main()
{
	Complex c1(3, 2);
	Complex c2(4, -5);

	Complex sum = c1.addComplex(c2);
	sum.printComplex();

	Complex diff = c1.subtractComplex(c2);
	diff.printComplex();

}
