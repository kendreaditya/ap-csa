// Aditya Kendre
// 2-27-19
// Distance Header File


#pragma once
#ifndef DISTANCE_H
#define DISTANCE_H
#include<iostream>
#include<string>
using namespace std;

class Distance
{
	friend ostream &operator<<(ostream &, Distance &);

public:
	Distance();
	Distance(double, string);
	Distance operator+( Distance &);
	Distance operator-( Distance &);
	Distance convMeter(Distance &);
	int linearSearch(string[], int, string);
	bool operator==( Distance &);
	bool operator!=( Distance &);
	bool operator<( Distance &);
	bool operator>( Distance &);
	bool operator>=( Distance &);
	bool operator<=( Distance &);
private:
	double num;
	string unit;
	/*int index;*/
};

#endif