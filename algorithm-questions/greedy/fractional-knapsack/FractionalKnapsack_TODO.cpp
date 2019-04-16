#include <iostream>
using namespace std;

int findMaxLessIndexValue(int val[], int n, int index);

int solution(int arr[][2], int n, int capacity)
{
	/*
	int result = 0, currWeight = 0;
	int val[n];
	int max = 0, index = 0;
	for (int i = 0; i < n; i++)
	{
		val[i] = arr[i][0] / arr[i][1];
		if (val[i] > max)
		{
			max = val[i];
			index = i;
		}
	}
	while (result < capacity)
	{

		result += (capacity - currWeight) > arr[index][1] ? val[index] : val[index] * (capacity - currWeight) / arr[index][1];
		index = findMaxLessIndexValue(val, n, index);
	}
	return result;
	*/
}
/*
int findMaxLessIndexValue(int val[], int n, int index)
{
	int max = 0, limit = val[index];
	for (int i = 0; i < n; i++)
	{
		if (val[i] > max && val[i] <= limit && i != index)
		{
			return i;
		}
	}
}
*/
int main()
{
	/*cout << "Please input knapsack size: " << endl;
	int size = 0;
	cin >> size;
	int arr[size][2];
	for (int i = 0; i < size; i++)
	{
		cout << "input item "<< i << " value and weight: " << endl;
		cin >> arr[i][0] >> arr[i][1];
	}
	cout << "Please input capacity of knapsace: ";
	int capacity = 0;
	cin >> capacity;
	*/
	int arr[3][2] = {{60, 10}, {100, 20}, {120, 30}};
	int size = 3, capacity = 50; // maximum value : 220
	cout << solution(arr, size, capacity) << endl;

	return 0;
}