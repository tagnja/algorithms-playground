
public class Mergesort
{
	static void mergesort(int arr[], int left, int right)
	{
		if (left < right)
		{
			int middle = (left + right) / 2;
			mergesort(arr, left, middle);
			mergesort(arr, middle+1, right);
			merge(arr, left, middle, right);
		}
	}
	
	static void merge(int arr[], int left, int middle, int right)
	{
		int n1 = middle - left + 1;
		int n2 = right - middle;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++)
		{
			L[i] = arr[left+i]; // notice. it is left+i rather than i
		}
		for (int j = 0; j < n2; j++)
		{
			R[j] = arr[middle+1+j];
		}
		int k = left, i = 0, j = 0; // notice. k=left rather than k = 0
		while(i < n1 && j < n2)
		{
			if (L[i] < R[j])
			{
				arr[k++] = L[i++];
			}
			else
			{
				arr[k++] = R[j++];
			}
		}
		
		while (i < n1)
		{
			arr[k++] = L[i++];
		}
		while (j < n2)
		{
			arr[k++] = R[j++];
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {3, 1, 2, 4, 7, 4, 0, 3, 5}; // 0, 1, 2, 3, 3,  4, 4, 5, 7
		mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}