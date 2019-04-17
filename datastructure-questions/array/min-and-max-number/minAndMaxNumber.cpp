#include <iostream>
#include <limits.h>
using namespace std;

int main()
{
    int n, max = 0, min = LONG_MAX, x = 0;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        if (x > max)
        {
            max = x;
        }
        if (x < min)
        {
            min = x;
        }
    }
    cout << min << " " << max << endl;
    return 0;
}