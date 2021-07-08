#include <iostream>
#include "Circle.h"
using namespace std;

int main()
{
  circle c1;
  c1.setX(2);
  c1.setY(-3);
  c1.setRadius(-4);
  c1.circleEquation();
  cout << c1.circleCircumfrince() << endl << c1.circleArea() << endl;





  return 0;
}