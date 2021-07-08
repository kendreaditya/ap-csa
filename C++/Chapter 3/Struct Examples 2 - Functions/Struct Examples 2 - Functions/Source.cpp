#include<iostream>
#include<string>
using namespace std;

struct Product
{
	string name;
	double price;
	void print();
};

void Product::print()
{
	cout << name << " costs $" << price << endl;
}

int main()
{
	Product p1;
	p1.name = "Cereal";
	p1.price = 3.99;
	p1.print();


	return 0;
}