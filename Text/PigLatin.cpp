//============================================================================
// Name        : PigLatin.cpp
// Author      : Drew Mazak
// Version     :
// Copyright   : 
// Description : Reverse a string in C++
//============================================================================

#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;

int main() {
	char str[128];
	char temp;
	char *start, *end;
	int endIndex;
	start = str;

	for (int i = 0; i < sizeof(str); i++)
	{
		str[i] = ' ';
	}
	cout << "Enter a string: " << endl;
	cin >> (str);
	for (int i = 0; i < sizeof(str); i++)
	{
		if (str[i] == ' ')
		{
			end = &str[i-1];
			endIndex = i;
		}
	}

	temp = *start;
	*start = *end;
	*end = temp;

	for (int i = 0; i < sizeof(str); i++)
	{
		if (str[i] == ' ')
		{
			continue;
		};
		cout << str[i];
	}
	cout << "-" << "ay" << endl;
	return 0;
}
