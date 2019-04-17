/**
	1. find all number
		a-z using:  int isalpha(int c)
		0-9 using:  int isdigit(int c)
		string length: str.length();
		string substring: str.substr(int start, int size)
		string to number: stoi(str);
	2. calculate
 */

#include <iostream>

using namespace std;

double solution(string str)
{
	int leftSum = 0, rightSum = 0;
	int pos = str.length();
	int i = 0, flag = 0;
	
	while (str[i])
	{
		if ((str[i] == '+' || str[i] == '-' || str[i] == '=') && flag != i)
		{
			
			if (i <= pos)
			{	
				if (isalpha(str[i-1]))
				{
					//cout << "1:" << str.substr(flag, i - flag-1) << endl;
					leftSum += stoi(str.substr(flag, i - flag-1));
				}
				else
				{
					//cout << "2:" << str.substr(flag, i - flag) << endl;
					rightSum -= stoi(str.substr(flag, i - flag));
				}
			}
			else if (i > pos)
			{
				if (isalpha(str[i-1]))
				{
					//cout << "3:" << str.substr(flag, i - flag-1) << endl;
					leftSum -= stoi(str.substr(flag, i - flag-1));
				}
				else
				{
					//cout << "4:" << str.substr(flag, i - flag) << endl;
					rightSum += stoi(str.substr(flag, i - flag));
				}
			}
			flag = i;
			if (str[i] == '=')
			{
				pos = i;
				flag++;
			}
		}
		if (i == (str.length() - 1))
		{
			//cout << "i:" << i<< endl;
			if (isalpha(str[i]))
			{
				//cout << "5:" << str.substr(flag, i - flag) << endl;
				leftSum -= stoi(str.substr(flag, i - flag));
			}
			else
			{
				//cout << "6:" << str.substr(flag, i - flag + 1) << endl;
				rightSum += stoi(str.substr(flag, i - flag + 1));
			}
		}
		
		i++;
	}
	//cout << leftSum << ", " << rightSum << endl; // 6a-5+1=2-2a => 8, 6
	return rightSum/(double)leftSum;
}
int main()
{
	
	string str = "";
	cin >> str;
	cout << solution(str) << endl;
	return 0;
}