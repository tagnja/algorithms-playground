public class LongestDereaseSequence
{
	
	static int max_ref = 1;
	static int solution(int arr[], int n)
	{
		if (n == 1)
		{
			return 1;
		}
		int res, max_temp = 1;
		for (int i = 1; i < n; i++)
		{
			res = solution(arr, i);
			if (arr[i-1] >= arr[n-1] && res + 1 > max_temp)
			{
				max_temp = res + 1;
			}
		}
		
		if (max_temp > max_ref)
		{
			max_ref = max_temp;
		}
		
		return max_temp;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {389, 207, 155, 300, 299,170, 158, 65}; // longest decrease sequence : 6
		solution(arr, arr.length);
		System.out.println(max_ref);
		
	}
}