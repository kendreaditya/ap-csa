#include"Distance.h"
#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

string unitsConv[] = { "mm","cm","in","ft","m","mi","km" };

double conv[] = { 1000, 100, 39.3701, 3.28, 1, 0.000621371, .001 };

int Distance::linearSearch(string a[], int size, string key)
{
	for (int x = 0; x < size; x++)
	{
		if (a[x] == key)
			return x;
	}
	return -1;
}
				
Distance::Distance()
{
	num = 1;
	unit = "m";
}

Distance::Distance(double n, string u)
	: num(n)
{
	for (int i = 0; i <= 6; i++)
	{
		if (unitsConv[i] == u)
			unit = u;
		else
			unit = "m";
	}


}
Distance Distance::convMeter(Distance &d)
{
	int index = linearSearch(unitsConv, 7, d.unit);
	d.num *= conv[index];
	d.unit = "m";
	//d.index = index;
	return d;
}

Distance Distance::operator+(Distance &right)
{
	Distance temp;
	if (unit == right.unit)
	{
		temp.unit = unit;
		temp.num = num + right.num;
		return temp;
	}
	else
	{
		Distance dist;
		dist.unit = unit;
		dist.num = num;
		convMeter(right);
		convMeter(dist);
		temp.num = right.num + dist.num;
		if (num < right.num)
		{
			int index = linearSearch(unitsConv, 7, unit);
			temp.num /= conv[index];
			temp.unit = unit;
		}
		else
		{
			int index = linearSearch(unitsConv, 7, right.unit);
			temp.num /= conv[index];
			temp.unit = right.unit;
		}

		return temp;
	}
}
//Distance Distance::operator-(Distance &right)
//{
//
//}
//
//bool Distance::operator==( Distance &right)
//{
//
//}
//bool Distance::operator!=( Distance &right)
//{
//
//}
//bool Distance::operator<( Distance &right)
//{
//	
//}
//bool Distance::operator>( Distance &right)
//{
//
//}
//bool Distance::operator>=( Distance &right)
//{
//
//}
//bool Distance::operator<=( Distance &right)
//{
//
//}

ostream &operator<<(ostream &output, Distance &right)
{
	output << right.num << " " << right.unit;
	return output;
}