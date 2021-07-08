#include<iostream>
#include <algorithm>
using namespace std;

struct Fraction
{
	int num, den;
	void print();
	void simplify();

};

void Fraction::print()
{
	cout << num << "/" << den << endl;
}

void Fraction::simplify()
{
	int maxNum = max(den, num);
	for (int x = maxNum; x > 0; x--)
	{
		if ((den % x == 0) && (num % x == 0))
		{
			den /= x;
			num /= x;
			break;
		}
	}
}

int main()
{
	Fraction f1;
	cin >> f1.num >> f1.den;
	f1.print();
	f1.simplify();
	f1.print();

	return 0;
}

