#pragma once

#ifndef CIRCLE_H
#define CIRCLE_H

class circle {
private:
	int x, y, radius;
public:
	circle();
	circle(int, int, int);

	void setX(int);
	int getX();
	void setY(int);
	int getY();
	void setRadius(int);
	int getRadius();

	void circleEquation();

	double circleCircumfrince();
	double circleArea();
};
#endif // !CIRCLE_H

