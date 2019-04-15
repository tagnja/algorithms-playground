public class MinCostPath
{
	static final int R = 3,  C = 3;
	static int dp[][] = new int[R][C]; 
	static int a[][] = 
	{
			{1, 2, 3},
			{4, 8, 2},
			{1, 5, 3}
	};
	static 
	{
		for (int i = 0; i < R; i++)
		{
			for (int j = 0; j < C; j++)
			{
				dp[i][j] = -1;
			}
		}
	}
	static int solution(int a[][], int i, int j)
	{
		if (i < 0 || j < 0)
		{
			return Integer.MAX_VALUE;
		}
		if (i == 0 && j == 0)
		{
			return a[0][0];
		}
		if (dp[i][j] != -1)
		{
			return dp[i][j];
		}
		return dp[i][j] = (a[i][j] + min(solution(a, i-1, j), solution(a, i, j-1), solution(a, i-1, j-1)));
	}
	
	public static int min(int a, int b, int c)
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
	
	public static void main(String[] args)
	{
		
		System.out.println(solution(a, 2, 2));
	}
}