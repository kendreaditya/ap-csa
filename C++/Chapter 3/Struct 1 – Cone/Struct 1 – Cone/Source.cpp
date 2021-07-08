#include<iostream>
#include<cmath>
using namespace std;

double pi = 3.14159265359;

struct Cone
{
	double radius, height;
};

void slantHeight(Cone);
void surfaceArea(Cone);
void volume(Cone);


int main()
{
	int h, r;

	cin >> h >> r;

	Cone c1;
	c1.height = h;
	c1.radius = r;
	slantHeight(c1);
	surfaceArea(c1);
	volume(c1);

	return 0;
}

void slantHeight(Cone c)
{
	double slantHeight = sqrt((c.height*c.height) + (c.radius*c.radius));
	cout << "The slant height is " << slantHeight << endl;
}
void surfaceArea(Cone c)
{
	double area = (pi * c.radius*(c.radius+ sqrt((c.height*c.height) + (c.radius*c.radius))));
	cout << "The area is " << area << endl;
}
void volume(Cone c)
{
	double volume = (pi * c.radius*c.radius*(c.height/3));
	cout << "The volume is " << volume << endl;
}