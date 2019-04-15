
import java.util.Scanner;

public class CoinsBytelandianGoldCoins 
{
//	static int MAX = 1000000001;
	static int MAX = 100;
	static int[] dp = new int[MAX];
	static 
	{
		for (int i = 0; i < MAX; i++)
		{
			dp[i] = -1;
		}
	}
	public static int solution(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		
		if (dp[n] != -1)
		{
			return dp[n];
		}
		dp[n] = solution(n/2) + solution(n/3) + solution(n/4);
		dp[n] = dp[n] > n ? dp[n] : n;
		
		return dp[n]; 
	}
	
	public static void main(String[] args)
	{
//		System.out.println(solution(13));
//		System.out.println(solution(2));
		
		/*
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			System.out.println(solution(sc.nextInt()));
		}
		*/
		for (int i=0; i < 50; i++)
		{
			System.out.println(solution(i));
		}
	}
}
