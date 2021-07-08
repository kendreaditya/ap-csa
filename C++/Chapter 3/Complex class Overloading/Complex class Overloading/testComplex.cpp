#include"Complex.h"
#include<iostream>
using namespace std;

int main()
{
	Complex c1(2, 3);
	Complex c2(4, 5);

	Complex sum = c1 + c2;
	cout << sum << endl;

	Complex diff = c1 - c2;
	cout << diff << endl;

	Complex prod = c1 * c2;
	cout << prod << endl;
}
