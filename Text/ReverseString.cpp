//============================================================================
// Name        : ReverseString.cpp
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

	start = str;
	end = &str[sizeof(str)-1];

	for (int i = 0; i < sizeof(str); i++)
	{
		str[i] = ' ';
	}
	cout << "Enter a string: " << endl;
	cin >> (str);

	while (end > start)
	{
		temp = *start;
		*start = *end;
		*end = temp;
		start++;
		end--;
	}
	for (int i = 0; i < sizeof(str); i++)
	{
		if (str[i] == ' ')
		{
			continue;
		};
		cout << str[i];
	}

	return 0;
}
