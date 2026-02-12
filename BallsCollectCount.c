#include <stdio.h>

int main()
{
    int T, N;
    scanf("%d %d", &T, &N);

    int matrix[T][N];

    for(int i = 0; i < T; i++) {
        for(int j = 0; j < N; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    int K;
    scanf("%d", &K);

    int collected = 0;

    // Process each bucket (column)
    for(int j = 0; j < N; j++) {

        int current = 0;

        // From last row upwards
        for(int i = T - 1; i >= 0; i--) {

            current += matrix[i][j];

            if(current >= K) {
                collected += K;
                current = 0;   // bucket emptied
            }
        }
    }

    printf("%d", collected);

    return 0;
}

/*
There are N empty buckets in a row. Every second, a certain number of balls fill each bucket.

The maximum capacity of each bucket is K. If the number of balls exceeds the maximum capacity of a bucket, the remaining balls will overflow. When a bucket is full or overflowing, a boy collects the balls from the bucket and empties the bucket again. The program must accept an integer matrix of size T'N representing the number of balls that fall into N buckets in T seconds and the value of K as the input. The program must print the number of balls he can collect as the output. At T = 1, the balls in the last row of the matrix will fall into the N buckets.

At T2, the balls in the last but one row of the matrix will fall into the N buckets and so on.

Boundary Condition(s):

1<=T, N <= 50

1<= Matrix element value <= 1000

1<= K <= 10^4

Input Format:

The first line contains T and N separated by a space.

The next T lines, each containing N integers separated by a space.

The T+2nd line contains K.

Output Format:

The first line contains the number of balls the boy can collect.

Example Input/Output 1:

Input:

11514

54324

55 34322 51413 14222 8

Output: 48
*/
