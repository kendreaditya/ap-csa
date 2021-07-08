#include"LinkedList.h"
#include<iostream>
#include<string>
using namespace std;


int main()
{
	Song *song1 = new Song;
	song1->artist = "Mr. Ensminger";
	song1->title = "Recursion, Recursion";

	Song *song2 = new Song;
	song2->artist = "PewDiePie";
	song2->title = "b***h lasagna";

	Song *song3 = new Song;
	song3->artist = "TTV ts_tnns";
	song3->title = "bots, bots, bots";

	LinkedList playList;
	playList.insertSong(song1, 1);
	playList.insertSong(song2, 2);
	playList.insertSong(song3, 3);
	playList.printList();

	playList.removeSong(2);
	playList.printList();


	return 0;

}