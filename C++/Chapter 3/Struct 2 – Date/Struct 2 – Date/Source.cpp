#include<iostream>
#include<string>
using namespace std;

struct Date
{
	int month, day, year;
};

void printNumericDate(Date);
void printWordDate(Date);


int main()
{
	int m, d, y;
	cin >> m >> d >> y;

	Date d1;
	d1.month = m;
	d1.day = d;
	d1.year = y;
	printNumericDate(d1);
	printWordDate(d1);

	return 0;
}

void printNumericDate(Date d)
{
	cout << d.month << "/" << d.day << "/" << d.year << endl;
}
void printWordDate(Date d)
{
	string Months[] = { "January","February","March","April","May","June","July","August","September","October","November","December" };
	cout << Months[d.month-1] << " " << d.day << "," << d.year << endl;
}