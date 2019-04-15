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
		return i;
	}
	public static int partition2(int arr[], int low, int high)
	{
		// pivot (Element to be placed at right position)
	    int pivot = arr[high];  
	 
	    int i, j;
	    i = (low - 1);  // Index of smaller element

	    for (j = low; j <= high- 1; j++)
	    {
	        // If current element is smaller than or
	        // equal to pivot
	        if (arr[j] <= pivot)
	        {
	            i++;    // increment index of smaller element
	            //swap arr[i] and arr[j]
	            int t = arr[i];
	            arr[i] = arr[j];
	            arr[j] = t;
	        }
	    }
	    //swap arr[i + 1] and arr[high])
	    arr[high] = arr[i+1];
	    arr[i+1] = pivot;
	    return (i + 1);
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
