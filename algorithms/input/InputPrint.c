#include <stdio.h>

int main()
{
	printf("Please input size of array: \n");
	int size;
	scanf("%d", &size);
	int a[size];
	
	printf("Please input elements of arrsy: \n");
	for (int i = 0; i <  size; i++)
	{
		scanf("%d", &a[i]);
	}
	for (int i = 0; i < size; i++)
	{
		printf("%d\n", a[i]);
	}
	
	return 0;
}