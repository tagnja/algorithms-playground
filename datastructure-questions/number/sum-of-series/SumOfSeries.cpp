#include <iostream>

using namespace std;

int main()
{
	double sum = 1;
	int i = 1, k = 0;
	cin >> k;
	while (sum <= k)
	{
		sum += i/(++i); 
	}
	cout << i;
	return 0;
}