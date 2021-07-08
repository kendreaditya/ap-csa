#pragma once
#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include<iostream>
#include<string>
using namespace std;

// One song, has a song, a title, and artist
struct Song
{
	string title;
	string artist;
	Song *next;
};

class LinkedList
{
private:
	Song * head = new Song;		// First  song in the list
	int listLength;				// How many songs are in the list?
public:
	LinkedList();				// Creates an empty playlist
	bool insertSong(Song *newSong, int position);
	bool removeSong(int position);
	void printList();
};
#endif // !LINKEDLIST_H

