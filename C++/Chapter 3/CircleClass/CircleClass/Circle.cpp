#include"Circle.h"
#include<iostream>

using namespace std;

circle::circle()
{
  x,y,radius = 1;
}

circle::circle(int x2, int y2, int radius2)
{
  if(radius2 > 0) radius = radius2;
  else radius2, radius = 1;
}

void circle::setX(int x2)
{
  x = x2;
}
void circle::setY(int y2)
{
  y = y2;
}
void circle::setRadius(int radius2)
{
  if(radius2 > 0) radius = radius2;
  else radius2, radius = 1;
}

int circle::getX()
{
  return x;
}
int circle::getY()
{
  return y;
}
int circle::getRadius()
{
  return radius;
}

void circle::circleEquation()
{
  if(x < 0 && y < 0)
    cout << "(x+" <<(x*(-1)) << ")^2 + (y+" << (y*(-1)) << ")^2 = " << radius*radius << endl;
  if(x < 0 && y > 0)
    cout << "(x+" <<(x*(-1)) << ")^2 + (y-" << y << ")^2 = " << radius*radius << endl;
  if(x > 0 && y < 0)
    cout << "(x-" << x << ")^2 + (y+" << (y*(-1)) << ")^2 = " << radius*radius << endl;
  if(x > 0 && y > 0)
    cout << "(x-" << x << ")^2 + (y-" << y << ")^2 = " << radius*radius << endl;
  
}

double circle::circleCircumfrince()
{
  return 2*3.14*radius;
}
double circle::circleArea()
{
  return 3.14*radius*radius;
}