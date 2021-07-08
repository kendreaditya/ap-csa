#include<iostream>
#include<vector> 

using namespace std;

int diceodometer(int);

int main()
{	
	vector<int> numOrder;
	int numAmount;

	cin >> numAmount;

	for (int i = 1; i <= numAmount; i++)
		numOrder.push_back(1);
	
	for (int i = 2; i <= numAmount; i++)
	{
		if (numAmount % i == 0) {
			numOrder[i-1] += 1;
			for (auto it = numOrder.begin(); it != numOrder.end(); it++)
				cout << *it << " ";
			cout << endl;
		}
	}


	for (auto it = numOrder.begin(); it != numOrder.end(); it++)
		cout << *it << " ";
	return 0;
}

int diceodometer(int count)
{	
	return 0;
}