public class Quicksort 
{
	public static void quicksort(int a[], int left, int right)
	{
		if (a == null || left >= right)
		{
			return;
		}
		int pi = partition(a, left, right);
		quicksort(a, left, pi-1);
		quicksort(a, pi+1, right);
		
	}

	private static int partition(int[] a, int left, int right) 
	{
		int temp = a[right];
		int i = left, j = right - 1;
		while (i < j)
		{
			while(a[i] < temp && i < right) 
			{
				i++;
			}
			while(a[j] >= temp && j > left)
			{
				j = j-1;
			}
			if (i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		if (i >= j)
		{
			a[right] = a[i];
			a[i] = temp;
		}
		/*System.out.println("result i: " + (i));
		for (int m = 0; m < a.length; m++)
		{
			System.out.print(a[m] + " ");
		}
		System.out.println();*/
		return i;
	}
	
	public static void main(String[] args) 
	{
		int a[] = {1, 4, 2, 5, 6, 1, 4, 23, 2, 12};
		quicksort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
