#include"Date.h"
#include<iostream>
#include<string>
using namespace std;

int Date::days[] = {0, 31, 28, 31, 30, 31, 30, 31 ,31, 30, 31 ,30 ,31 };

// Default Constructor Boy
Date::Date()
{
	setDate(1, 1, 2000);
}

//Specific Constructor Boy
Date::Date(int m, int d, int y)
{
	setDate(m, d, y);
}

void Date::setDate(int m, int d, int y)
{
	if (m >= 1 && m <= 12) month = m;
	else throw invalid_argument("Month muse be between 1 and 12");

	if (y >= 1753) year = y;
	else throw invalid_argument("Year must be at least 1753");

	if ((month == 2 && leapYear(year) == true && d >= 1 && d <= 29) || (d >= 1 && d <= days[month])) day = d;
	else throw invalid_argument("Day is out of range for that month");
}

bool Date::leapYear(int y)
{
	if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) return true;
	else return false;
}

bool Date::endOfMonth(int d)
{
	if (month == 2 && leapYear(year) == true)
	{
		if (d = 29) return true;
		else return false;
	}
	
	else
	{
		if (d == days[month]) return true;
		else return false;
	}
}

// Prefix		++today
Date &Date::operator++()
{
	helpIncrement();
	return *this;

}

// Postfix		today++
Date Date::operator++(int)
{
	Date temp = *this;
	helpIncrement();
	return temp;
}

Date &Date::operator+=(int num)
{
	for (int x = 1; x <= num; x++)
		helpIncrement();
	return *this;

}

// Prefix		--today
Date &Date::operator--()
{
	helpDecrement();
	return *this;

}

// Postfix		today--
Date Date::operator--(int)
{
	Date temp = *this;
	helpDecrement();
	return temp;
}

Date &Date::operator-=(int num)
{
	for (int x = 1; x <= num; x++)
		helpDecrement();
	return *this;

}

void Date::helpIncrement()
{
	if (endOfMonth(day) == false) day++;
	else if(month < 12)
	{
		month++;
		day = 1;
	}
	else
	{
		year++;
		month = 1;
		day = 1;
	}

}

void Date::helpDecrement()
{
	if (day != 1) day--;
	else if (month == 3 && day == 1 && leapYear(year) == true)
	{
		month = 2;
		day = 29;
	}
	else if (month > 1)
	{
		month--;
		day = days[month];
	}
	else
	{
		year--;
		month = 12;
		day = 31;
	}

}

ostream &operator<<(ostream &output, Date &d)
{
	string monthName[13] = { "", "Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sept", "Oct", "Nov", "Dec" };

	output << monthName[d.month] << " " << d.day << ", " << d.year;
	return output;
}