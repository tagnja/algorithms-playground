#include <iostream>


int getFibonaciiNumber(int n) {
	if (n == 1 || n == 2)
	{
		return 1;
	}
	return getFibonaciiNumber(n - 1) + getFibonaciiNumber(n - 2);
}

int main() 
{
	int n = 1;
	std::cin >> n;
	std::cout << getFibonaciiNumber(n);
	return 0;
}
