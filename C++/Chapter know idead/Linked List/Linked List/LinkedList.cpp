#include"LinkedList.h"
#include<iostream>
#include<string>
using namespace std;

LinkedList::LinkedList()
{
	// -> is the operator equavalent to the dot
	head->title = "head of list (no title)";
	head->artist = "head of list (no artist)";
	head->next = NULL;
	listLength = 0;

	// This is a boolean function so that we can return false if we attemp to insert a song at an invalid position
}
	bool LinkedList::insertSong(Song *newSong, int position)
	{
		if (position <= 0 || position > listLength + 1)
		{
			cout << "Error - invalid position" << endl;
			return false;
		}
		// Is the song being inserted at the beginning?
		if (head->next == NULL)
		{
			head->next = newSong;
			listLength++;
			return true;
		}
		// If we want to insert the song in the middle of the list, we must traverse the list sequentially item by item
		int count = 0;
		Song *current = head;
		Song *next = head;

		while (next)
		{
			if (count == position)
			{
				current -> next = newSong;
				newSong->next = next;
				listLength++;
				return true;
			}
			current = next;
			next = current -> next;
			count++;

		}

		if (count == position)
		{
			current->next = newSong;
			newSong->next = NULL;
			listLength++;
			return true;
		}
		// Code should never get here
		cout << "ERROR, end of function reached!" << endl;
		return false;
	}

	bool LinkedList::removeSong(int position)
	{
		if (position <= 0 || position > listLength + 1)
		{
			cout << "Position out of range" << endl;
			return false;
		}

		if (head->next == NULL)
		{
			cout << "No string in the list" << endl;
			return false;
		}

		int count = 0;
		Song *current = head;
		Song *next = head;

		while (next)
		{
			if (count == position)
			{
				current->next = next->next;
				delete next;
				listLength--;
				return true;
			}
			current = next;
			next = current->next;
			count++;
		}
		cout << "Error, end of remove reached!" << endl;
		return false;
	}

	// Remeber, these lists don't have [], you have to go through each item sequentially
	void LinkedList::printList()
	{
		Song *current = head;
		Song *next = current->next;

		cout << "MY PLAYLIST" << endl << "=--------------------------------------------------------------------------=" << endl;

		for (int x = 0; x < listLength; x++)
		{
			current = next;

			cout << current->title << "\t" << current->artist << endl;

			next = current->next;
		}
	}