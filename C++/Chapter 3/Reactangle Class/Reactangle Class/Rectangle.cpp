// HOW DO EVERYTHING WORK

#include"Reactangle.h" // "" are used b/c its not a built-in header
#include<iostream>		// <> means the header is bult-int
using namespace std;


// Default constructor - this function sets the valuse of the variables in the object when you first declare it.
// Meaning. what do you want length and width to be when you declare "Rectangle r1:...?

Rectangle::Rectangle() // Class::Function 
{
	length = 1; // the starting valuse are up to you
	width = 1;

}

// Specific Constructor - this is an overloaded function (same name, but different parameters) which allows us
//	to define the valuse of the rectangle's members at the time of creation (difference betweem int num vs int num = 10)

// This allows us to say Rectangle r1(8,5) (length is 8, width is 5)

Rectangle::Rectangle(double len, double wid)
{
	// This is where you must provide security to your values

	if (len > 0)
		length = len;
	else
	{
		cout << "Invalid length - setting to default" << endl;
		length = 1;
	}
	if (wid > 0)
		width = wid;
	else
	{
		cout << "Invalid width - setting to default" << endl;
		width = 1;
	}
}

void Rectangle::setLength(double len)
{
	if (len > 0)
		length = len;
	else
	{
		cout << "Invalid length - setting to default" << endl;
		length = 1;
	}
}

void Rectangle::setWidth(double wid)
{
	if (wid > 0)
		width = wid;
	else
	{
		cout << "Invalid width - setting to default" << endl;
		width = 1;
	}
}

// The get functions - no parameters, just a quick return!
// We need these because we can't refer to "length" or "width" outside of the class, since they're private
double Rectangle::getLength()
{
	return length;
}

double Rectangle::getWidth()
{
	return width;
}

// Every class will have its own uniquw functions but (almost) every class will have a way to display itself

void Rectangle::printRectangle()
{	
	cout << "This rectangle's length is " << length << " and its width is " << width << endl;
}

double Rectangle::rectangleArea()
{
	return length * width;
}

double Rectangle::rectanglePerimeter()
{
	return (length*2)+(width*2);
}