#include<iostream>
#include<string>
using namespace std;

struct Employee { string firstName, lastName; int age; double salary; };
struct Point { double x,y; };

void print(Employee);
void print(Point);
Point zeroPoint();

int main()
{
	Employee emp1;
	emp1.firstName = "Tehami";
	emp1.lastName = "Ammahd";
	emp1.age = 15;
	emp1.salary = 50000;


	Employee emp2;
	emp2.firstName = "Vs";
	emp2.lastName = "tnns";
	emp2.age = 15;
	emp2.salary = 100000;

	// Who is older?

	if (emp1.age > emp2.age) cout << emp1.firstName << " is older than " << emp2.firstName << endl;
	else cout << emp2.firstName << " is older than " << emp1.firstName << endl;

	//Give a 2% raise
	emp1.salary *= 1.02;
	emp2.salary *= 1.02;

	print(emp1);
	print(emp2);

	Point p[8];

	for (int i = 0; i < 8; i++)
	{
		p[i] = zeroPoint();
		print(p[i]);
	}

	return 0;
}

void print(Employee e)
{
	cout << e.firstName << " " << e.lastName << " is ";
	cout << e.age << " years old and makes $" << e.salary << endl;
}

void print(Point p)
{
	cout << "(" << p.x << ", " << p.y << ")" << endl;
}

Point zeroPoint()
{
	Point temp;
	temp.x = 0;
	temp.y = 0;
	return temp;
}