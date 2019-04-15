#include <iostream>
using namespace std;

int solution(int n, int k)
{
    cout << n << k << "\n";
    if (k == 1)
    {
        return 1;
    }
    int max = 0, min = 0, result = 0;
    max = n - k + 1;
    min = n % k == 0 ? n / k : n / k + 1;
    
    for (int i = min; i <= max; i++)
    {
        result += solution(n- i, k-1);
    }
    return result;
}

int main()
{
    int n, k; //定义两个变量名
    cin >> n >> k; //从标准输入流中输入两个整数
    cout << solution(n, k); //输出到标准输出流中

	return 0;
}