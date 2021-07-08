#include<iostream>
#include"Distance.h"
using namespace std;
int main()
{
	Distance d1(12, "km");
	Distance d2(2, "cm");
	Distance sum;
	sum = d1 + d2;
	cout << sum << endl;
	return 0;
}