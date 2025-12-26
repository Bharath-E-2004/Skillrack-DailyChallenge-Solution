#include <limits.h>

void findMissingInteger(int R, int C, int matrix[R][C])
{
    int minValue = INT_MAX;
    int maxValue = INT_MIN;
    int missRow = -1, missCol = -1;

    // Step 1: Find min, max and position of -1
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            if (matrix[i][j] == -1)
            {
                missRow = i;
                missCol = j;
            }
            else
            {
                if (matrix[i][j] < minValue)
                    minValue = matrix[i][j];

                if (matrix[i][j] > maxValue)
                    maxValue = matrix[i][j];
            }
        }
    }

    // Step 2: Find missing value
    for (int val = minValue; val <= maxValue; val++)
    {
        int found = 0;

        for (int i = 0; i < R && !found; i++)
        {
            for (int j = 0; j < C; j++)
            {
                if (matrix[i][j] == val)
                {
                    found = 1;
                    break;
                }
            }
        }

        if (!found)
        {
            matrix[missRow][missCol] = val;
            return;
        }
    }
}
/*
The program must accept N integers as the input. For each integer X among the N integers, the program must find the smallest positive integer whose binary representation B is divisible by X (Consider B as a decimal number while performing division operation). Then the program must print the sum of the N resulting smallest integers as the output.

Boundary Condition(s): 1 <= N, Each integer value <= 100

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format: The first line contains an integer representing the sum of the N resulting smallest integers.

Example Input/Output 1:

Input:

4 12 8 23 19

Output: 114

Explanation:

1st integer 12: 28 -> 11100 (11100 is divisible by 12)

2nd integer 8: 8 -> 1000 (1000 is divisible by 8)

3rd integer 23:53 -> 110101 (110101 is divisible by 23)

4th integer 19:25 -> 11001 (11001 is divisible by 19)

28+8+53 + 25 = 114.

Hence 114 is printed as the output.

Example Input/Output 2:

Input 3 54 63 50

Output: 2785
*/
