public class LongestDereaseSequence2
{
	
	
	static int solution(int arr[], int n)
	{
		int LIS[] = new int[n];
		int max_ref = 0, i, j;
		for (i = 0; i < n; i++)
		{
			LIS[i] = 1;
		}
		
		for (i = 1; i < n; i++)
		{
			for (j = 0; j < i; j ++)
			{
				if (arr[i] <= arr[j] && LIS[j] + 1 > LIS[i])
				{
					LIS[i] = LIS[j] + 1;
				}
			}
			if (LIS[i] > max_ref)
			{
				max_ref = LIS[i];
			}
		}
		return max_ref;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {389, 207, 155, 300, 299,170, 158, 65}; // longest decrease sequence(LDS): 6
		int arr2[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 }; // LIS: 6
		System.out.println(solution(arr, arr.length));
		
	}
}