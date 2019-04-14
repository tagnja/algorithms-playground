#include <iostream>

using namespace std;

int main()
{
	cout << "Please input size of array: " << endl;
	int size;
	cin >> size;
	cout << "size is: " << size << endl;
	int a[size];
	
	cout << "Please input elements of array: " << endl;
	for (int i = 0; i < size; i++)
	{
		cin >> a[i];
	}
	
	for (int i = 0; i < size; i++)
	{
		cout << a[i] << endl;
	}
	return 0;
}