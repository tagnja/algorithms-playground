#include <iostream>
using namespace std;

int result = 0;
int max(int x, int y)
{
	return x > y ? x : y;
}
int solution(string X, string Y, int m, int n)
{
	if (n == 0 || m == 0)
	{
		return 0;
	}
	if (X[n-1] == Y[m-1])
	{
		return solution(X, Y, m-1, n-1) + 1;
	}
	else
	{
		return max(solution(X, Y, m-1, n), solution(X, Y, m, n-1));
	}
}


int main()
{
	string s1 = "ABCBDAB", s2 = "BDCABA";

	cout << "The length of LCS is " << solution(s1, s2, 7, 6) << endl;
	return 0;
}