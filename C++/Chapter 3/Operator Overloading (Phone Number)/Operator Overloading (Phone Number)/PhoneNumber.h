// PhoneNumber will be in the form (###) ###-####

#pragma once

#ifndef PHONENUMBER_H
#define PHONENUMBER_H

#include<iostream>
#include<string>
using namespace std;

class PhoneNumber
{
	friend ostream &operator<<(ostream &, PhoneNumber &);
	friend istream &operator>>(istream &, PhoneNumber &);

private:
	string areaCode, exchange, line;

};

#endif // !PHONENUMBER_H
