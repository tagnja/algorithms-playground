#include <iostream>

#define NIL -1
#define MAX 1000
 
int lookup[MAX];

void _initialize()
{
	int i;
	for (i = 0; i < MAX; i++) {
		lookup[i] = NIL;
	}
}
int getFibonaciiNumber(int n) {
	if (lookup[n] == NIL)
	{
		if (n <= 1)
			lookup[n] = n;
		else
			lookup[n] = getFibonaciiNumber(n - 1) + getFibonaciiNumber(n - 2);
	}
	return lookup[n];
}

int main() {
	_initialize();
	unsigned long long n = 1;
	std::cin >> n;
	n = getFibonaciiNumber(n);
	std::cout << n;
	return 0;
}