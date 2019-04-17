#include <iostream>

using namespace std;

void merge(int arr[], int low, int mid, int high);

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

int main()
{
	int n = 0;
	cout << "Please input size of array." << endl;
	cin >> n;
	cout << "Please input elements of array." << endl;
	int arr[n];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	mergesort(arr, 0, n - 1); // NOTICE. it is n-1 rather than n.
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
	return 0;
}