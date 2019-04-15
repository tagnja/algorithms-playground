#include <iostream>
using namespace std;

int max(int x, int y);

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

int max(int x, int y)
{
	return x > y ? x : y;
}

/*
 * TO Check
 */
int solution2(string X, string Y, int m, int n)
{
	if (m == 0 || n == 0)
	{
		return 0;
	}
	int result = 0;
	int i = 0, j = 0;
	int n1 = X.length(), n2 = Y.length();
	while (i < n1 && j < n2)
	{
		if (X[i] == Y[j])
		{
			result++;
			//cout << X[i] << endl;
		}
		else
		{
			if (X[i+1] == Y[j])
			{
				result++;
				i++;
				//cout << X[i] << endl;
			}
			else if (X[i] == Y[j+1])
			{
				result++;
				j++;
				//cout << X[i] << endl;
			}
		}
		i++;
		j++;
	}
	return result;
}

int main()
{
	string s1 = "ABCBDAB", s2 = "BDCABA";

	cout << "The length of LCS is " << solution(s1, s2, 7, 6) << endl;
	return 0;
}