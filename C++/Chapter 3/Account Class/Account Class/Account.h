#pragma once

#ifndef ACCOUNT_H
#define ACCOUNT_H

class Account
{
public:
	Account();
	Account(int,int);

	void credit(int);
	void debit(int);
	int credit();
	int debit();


private:
	int balance, credit;
};

#endif // !ACCOUNT_H

