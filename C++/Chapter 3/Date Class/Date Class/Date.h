#pragma once
#ifndef DATE_H
#define DATE_H

class Date
{
public:
	Date();
	Date(int,int,int);

	void setMonth(int);
	void setDay(int);
	void setYear(int);
	int returnMonth();
	int returnDay();
	int returnYear();

private:
	int month, day, year;
};

#endif // !DATE_H
