#include <stdio.h>
#include <stdlib.h>

int main()
{
    int N;
    scanf("%d", &N);

    for (int ctr = N; ctr >= 1; ctr--)
    {
        printf("%d", 1 << ctr);
    }

    return 0;
}
/*
   The program must accept an integer N as the Input. The program must print the first N powers of 2 in the reverse order as the output. Please fill in the blanks with code so that the program runs successfully.

Boundary Condition(#): 1 <= N <= 30

Input Format: The first line contains N.

Output Format: The first line contains the first N powers of 2 in the reverse order.

Example Input/Output 1:

Input: 5

Output: 32 16 8 4 2

Explanation:

Here N-5.

The first 5 powers of 2 are 2, 4, 8, 16 and 32. Hence the output is 32 16 8 4 2

Example Input/Output 2:

Input 12

Output:

4096 2048 1024 512 256 128 64 32 16 8 4 2
*/
