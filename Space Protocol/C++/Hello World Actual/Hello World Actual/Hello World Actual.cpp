// Hello World Actual.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <string>
using namespace std;

string favColor;

int _tmain(int argc, _TCHAR* argv[])
{
	cout << "Hello Wordl" << endl;
	cout << "What is your favorite color?" << endl;
	cin >> favColor;
	cout << "Your favorite color is " << favColor << "!" << endl;
	
	return 0;
}

