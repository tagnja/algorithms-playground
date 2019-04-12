#include <stdio.h>
#include <iostream>
#include <bits/stdc++.h>

#define R 3
#define C 3
int dp[R][C];
int a[R][C];

void _initial()
{
	a[0][0] = 1;
	a[0][1] = 2;
	a[0][2] = 3;
	a[1][0] = 4;
	a[1][1] = 8;
	a[1][2] = 2;
	a[2][0] = 1;
	a[2][1] = 5;
	a[2][2] = 3;
	for (int x = 0; x < R;x++)
	{
		for (int y = 0; y < C; y++)
		{
			dp[x][y] = -1;
		}
	}
}

int min(int a, int b, int c)
{
	if (a < b)
	{
		return a < c ? a : c;
	}
	else
	{
		return b < c ? b : c;
	}
}
int solution(int arr[R][C], int i, int j)
{
	if (i < 0 || j < 0)
	{
		return INT_MAX;
	}
	if (i == 0 && j == 0)
	{
		return arr[0][0];
	}
	g++if (dp[i][j] != -1)
	{
		return dp[i][j];
	}
	return dp[i][j] = arr[i][j] + min(solution(arr, i, j-1), solution(arr, i-1, j), solution(arr, i-1, j-1));
}


int main()
{
	_initial();
	std::cout << solution(a, 2,2);
	return 0;
}
