
#pragma once
#ifndef DATE_H
#define DATE_H

#include<iostream>
using namespace std;

class Date
{
	friend ostream &operator<<(ostream &, Date &);
	// We aren't going to code >> 

public:
	Date();
	Date(int, int, int);

	void setDate(int, int, int);

	// For the sake of brevity, we'll sjip the individual set/get

	Date &operator++();		// ++x (prefix)
	Date operator++(int);	// x++ (postfix)
	Date &operator+=(int);	// x += 5;

	Date &operator--();		// --x (prefix)
	Date operator--(int);	// x-- (postfix)
	Date &operator-=(int);	// x -= 5;

	bool leapYear(int);
	bool endOfMonth(int);
	void helpIncrement();
	void helpDecrement();

private:
	int month, day, year;
	static int days[];

};

#endif


//Scout says that Burris Ewell stays home from school so she should be able to do so too, but apparently what holds true for Ewells doesn't apply to Finches.
//Finally, Atticus proposes a compromise : they'll keep reading at home if she'll keep going to school—but she shouldn't tell Miss Caroline about it.
//
//Every day Scout runs by the Radley Place to get home after school.
//One day she notices something, and works up the nerve to go back and look at it.
//A tree at the edge of the Radley yard has some tinfoil stuck to a knothole, and inside the hole Scout finds two pieces of chewing gum.
//She takes it home, and, after some testing to try to make sure it's not poisoned, she chews it.
//Jem's not too pleased with this and makes her spit it out… and then gargle.
//Finally, it's summer. Hooray! School's out!
//On their way home, they find another piece of tinfoil in the same knothole, and behind it a jewelry box, decorated with more tinfoil, containing two Indian - head pennies.
//Should they keep it ? Chewing gum is one thing, but money is another entirely.
//Soon Dill shows up, full of stories.They're already bored, so Dill kick things up a notch by saying he can smell death, and tells Scout that her end is nigh.
//She tells him to shut it, and Jem mocks both of them for being(or pretending to be) superstitious.
//They horse around a little, and Scout ends up flying down the sidewalk in a tire(don't ask), which ends up dumping her in …
//	The Radleys' front yard.
//	Thanks to this adventure, Jem invents a new game: acting out the life and times of Boo Radley.
//	The game starts out simple, but gets more and more complex as the summer goes on.
//	Atticus gives this game the side - eye, but he doesn't explicitly forbid them from doing it since he doesn't know for sure what they're doing.
//	But Scout isn't so sure. She's pretty convinced that when she got dumped out of the tire she heard someone laughing inside the Radley house.