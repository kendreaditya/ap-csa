#include"Date.h"
#include<iostream>
using namespace std;

Date::Date()
{
	month, day = 1;
	year = 2000;
}

Date::Date(int m, int d, int y)
{
	// Pass the responsibility for validity checking to each of the set functions - saves code
	setYear(y);
	setMonth(m);
	setDay(d);

}

void Date::setYear(int y)
{
	if (y >= 1753) year = y;
	else
	{
		cout << "DUDE, ur so dumb, eneter a valid year" << endl;
		y = 1;
	}
}

void Date::setMonth(int m)
{
	if (1 <= m & m <= 12) month = m;
	else 
	{
		cout << "DUDE, ur so dumb, eneter a valid month" << endl;
		m = 1;
	}
}

void Date::setDay(int d)
{
	int dayPerMonth[] = {31,28,31,30,31,31,30,31,30,31};

	if (d >= 1 && d <= dayPerMonth[month]) day = d;
	else if (month == 2 && d == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) day = d;
	else
	{
		cout << "At least you tried" << endl;
		d = 1;
	}
}

int Date::returnDay()
{return day;}

int Date::returnMonth()
{return month;}

int Date::returnYear()
{return year;}
