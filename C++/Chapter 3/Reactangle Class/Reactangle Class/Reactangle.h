 /*
 Rectangle Header File

 This file contains the declarations of the object
 (the variables and functions prototypes)
 */

// This pre-processor command only allows you to include this file once in case you accidentally try to include it more than once

#pragma once

// IF the name "RECTANGLE.H" has not been defined yet, define it

#ifndef RECTANGLE_H
#define RECTANGLE_H

// In a struct, data is public - meaning we could possibly set the valuise to invalid numbers. 
//  For examples, we coulod have set length of the rectangle to -1. In a class,
//  we make the veriables PRIVATE and the function PUBLIC


class Rectangle
{

private:
	double length, width; // Both must be greater than 0

public:
	// Constructors - must have the same name as the class
	// They also do not have a return type, not even void
	Rectangle();
	Rectangle(double, double);

	// Every private variable in a class must have a public way to set and get the data
	void setLength(double);
	void setWidth(double);
	double getLength();
	double getWidth();

	// You should always have a way to display the object's data
	void printRectangle();


	// Print area and perimeter
	double rectangleArea();
	double rectanglePerimeter();

	
};

#endif // !RECTANGLE_H
