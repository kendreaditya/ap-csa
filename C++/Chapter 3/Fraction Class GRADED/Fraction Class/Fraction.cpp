#include"Fraction.h"
#include<iostream>
#include<algorithm>
using namespace std;

Fraction::Fraction(int rightNum, int rightDem)
{
	num = rightNum;

	if (rightDem == 0) dem = 1;
	else dem = rightDem;
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

Fraction Fraction::operator+(const Fraction &right) 
{
		return Fraction((right.dem*(num)) + (dem*right.num), (dem*right.dem));
}

Fraction Fraction::operator-(const Fraction &right) 
{
	if (dem == right.dem)
		return Fraction(num - right.num, dem);
	else
		return Fraction((right.dem*(num)) - (dem*right.num), (dem*right.dem));
}

Fraction Fraction::operator*(const Fraction &right) 
{
	return Fraction(num * right.num, dem*right.dem);
}

Fraction Fraction::operator/(const Fraction &right)
{
	return Fraction(num * right.dem, dem*right.num);
}

ostream &operator<<(ostream &output, Fraction &f)
{
	int maxNum = max(f.dem, f.num);
	for (int x = maxNum; x > 0; x--)
	{
		if ((f.dem % x == 0) && (f.num % x == 0))
		{
			f.dem /= x;
			f.num /= x;
			break;
		}
	}

	output << f.num << "/" << f.dem;
	return output;
}

bool Fraction::operator==(Fraction &right)
{
	if (num == right.num && dem == right.dem) return true;
	else return false;
}
bool Fraction::operator!=(Fraction &right)
{
	double f1 = (double)num / dem;
	double f2 = (double)right.num / right.num;
	if (f1 != f2) return true;
	else return false;
}
bool Fraction::operator<=(Fraction &right)
{
	double f1 = (double)num / dem;
	double f2 = (double)right.num / right.num;
	if (f1 <= f2) return true;
	else return false;
}
bool Fraction::operator>=(Fraction &right)
{
	double f1 = (double)num / dem;
	double f2 = (double)right.num / right.num;
	if (f1 >= f2) return true;
	else return false;
}
bool Fraction::operator<(Fraction &right)
{
	double f1 = (double)num / dem;
	double f2 = (double)right.num / right.num;
	if (f1 < f2) return true;
	else return false;
}
bool Fraction::operator>(Fraction &right)
{
	double f1 = (double)num / dem;
	double f2 = (double)right.num / right.num;
	if (f1 > f2) return true;
	else return false;
}
