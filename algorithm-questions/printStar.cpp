#include <iostream>
using namespace std;

/*
Using recursion printing star like this
*
**
***
****
*****
****
***
**
*
*/
void print(int num, int max, int add)
{
	if (num == 0)
	{
		return;
	}
	
	for (int i = 0; i < num; i++)
	{
		cout << "*";
	}
	cout << endl;
	
	if (num == max)
	{
		add = -1;
	}
	
	print(num + add, max, add);
	
}

int main()
{
	print(1, 5, 1);
	return 0;
}