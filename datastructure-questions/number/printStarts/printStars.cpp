#include <iostream>
using namespace std;
void solution(int n, bool flag)
{
	if (n == 0)
	{
		return;
	}
	for (int i = 0; i < n; i++)
	{
		cout << "*";
	}
	cout << endl;
	if (n == 5)
	{
		flag = false;
	}
	flag ? solution(++n, flag) : solution(--n, flag);
}

int main()
{
	solution(1, true);
	return 0;
}