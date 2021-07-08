#include"Date.h"
#include<iostream>
using namespace std;

int main()
{
	Date today(2, 7, 2019);
	today++;
	cout << today << endl;

	Date today1(1, 1, 2019);
	today1--;
	cout << today1 << endl;

	Date today2(2, 1, 2019);
	today2--;
	cout << today2 << endl;
	return 0;
}