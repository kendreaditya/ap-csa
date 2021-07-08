#include"Fraction.h"
#include<iostream>
#include<algorithm>
using namespace std;

Fraction::Fraction()
{
	num, dem = 1;

}

Fraction::Fraction(int n, int d)
{
	num = n;

	if (d == 0) dem = 1;
	else dem = d;
}

void Fraction::setDem(int d)
{
	if (d == 0) dem = 1;
	else dem = d;
}
void Fraction::setNum(int n)
{
	num = n;
}

int Fraction::getDem()
{
	return dem;
}
int Fraction::getNum()
{
	return num;
}

Fraction Fraction::addFraction(Fraction right)
{
		return Fraction((right.dem*(num)) + (dem*right.num), (dem*right.dem));
}

Fraction Fraction::subFraction(Fraction right)
{
	if (dem == right.dem)
		return Fraction(num - right.num, dem);
	else
		return Fraction((right.dem*(num)) - (dem*right.num), (dem*right.dem));
}

Fraction Fraction::multiFraction(Fraction right)
{
	return Fraction(num * right.num, dem*right.dem);
}
Fraction Fraction::diviFraction(Fraction right)
{
	return Fraction(num * right.dem, dem*right.num);
}

void Fraction::printFraction()
{
	int maxNum = max(dem, num);
	for (int x = maxNum; x > 0; x--)
	{
		if ((dem % x == 0) && (num % x == 0))
		{
			dem /= x;
			num /= x;
			break;
		}
	}

	cout << num << "/" << dem << endl;
}