#include <iostream>

using namespace std;
void mergesort(int arr[], int low, int high)
{
	if (low < high)
	{
		int mid = low + (high - low) / 2; // NOTICE it is low+(high-low)/2 rather than (high-low)/2
		mergesort(arr, low, mid);
		mergesort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
}

void merge(int arr[], int low, int mid, int high)
{
	int n = mid - low + 1;
	int m = high - mid;
	int a[n], b[m];
	for (int i = 0; i < n; i++)
	{
		a[i] = arr[low + i];
	}
	for (int j = 0; j < m; j++)
	{
		b[j] = arr[mid + j + 1];
	}
	int i = 0, j = 0, k = low;
	while (i < n && j < m)
	{
		if (a[i] <= b[j])
		{
			arr[k++] = a[i++];
		}
		else
		{
			arr[k++] = b[j++];
		}
	}
	while (i < n)
	{
		arr[k++] = a[i++];
	}
	while (j < m)
	{
		arr[k++] = b[j++];
	}
	
	for (int i = low; i <= high; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}

int solution(int a[], int b[], int m, int n)
{
	
}

int main()
{
	
	return 0;
}