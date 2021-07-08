// Definition of << and >> for the PhoneNumber class

#include"PhoneNumber.h"
#include<iostream>
#include<iomanip>
using namespace std;

ostream &operator<<(ostream &output, PhoneNumber &pn)
{
	output << "(" << pn.areaCode << ") " << pn.exchange << "-" << pn.line;
	return output;
}

istream &operator>>(istream &input, PhoneNumber &pn)
{
	// If we enter (###) ###-####, we need to skip the () and -

	input.ignore(1);					// Skip the first character
	input >> setw(3) >> pn.areaCode;	// store the areaCode
	input.ignore(2);					// skips the ) and the space
	input >> setw(3) >> pn.exchange;	// store the exchange
	input.ignore(1);					// skip the -
	input >> setw(4) >> pn.line;		// store the line

	return input;
}