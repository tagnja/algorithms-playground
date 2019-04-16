#include <iostream>
#include <stdio.h>
using namespace std;

int solution(int arr[], int n)
{

    int avg = 0;
    for (int i = 0; i < n; i++)
    {
        avg += arr[i];
    }
    avg /= n;

    int status = 0, count = 0;
    for (int i = 0; i < n; i++)
    {
		if (arr[i] != avg)
		{
			arr[i+1] += arr[i] - avg;
			count++;
		}
        /*
		int currStatus = arr[i] - avg;
        if (currStatus > 0)
        {
            if (i == 0)
            {
                count++;
                status += currStatus;
            }
            else if (i > 0)
            {
               
                //right move
                if (status >= 0)
                {
                    count++;
                    status += currStatus;
                }
               
                // left move
                if (status < 0)
                {
					status += currStatus;
                    if (currStatus + status == 0)
                    {
						count++;
                    }
                    else if (currStatus + status > 0)
                    {
						count++;
						count++;
                    }
                    
                }
            }
        }
        else if (currStatus == 0)
        {
            if (status != 0)
            {
                count++;
            }
        }
        else if (currStatus < 0)
        {
			
			if (status < 0)
			{
				status += currStatus;
			}
			if (status > 0)
			{
				if (status + currStatus > 0)
				{
					count++;
				}
			}
        }
		*/
    }
	return count;
}


int main()
{
    int n = 0;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << solution(arr, n) << endl;
    return 0;
}


