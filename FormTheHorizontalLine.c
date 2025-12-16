#include <stdio.h>
#include <stdlib.h>

int main() {
    int N;
    scanf("%d", &N);

    int arr[N][2];
    for (int i = 0; i < N; i++) {
        scanf("%d %d", &arr[i][0], &arr[i][1]);
    }

    int ans[100000];   // enough for all pairs
    int ind = 0;

    // Find all horizontal lines
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (arr[i][1] == arr[j][1]) {   // same y-coordinate
                ans[ind++] = abs(arr[i][0] - arr[j][0]);
            }
        }
    }

    // If no horizontal lines
    if (ind == 0) {
        printf("-1");
        return 0;
    }

    // Sort the lengths (Bubble sort is enough here)
    for (int i = 0; i < ind - 1; i++) {
        for (int j = i + 1; j < ind; j++) {
            if (ans[i] > ans[j]) {
                int temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
            }
        }
    }

    // Print result
    for (int i = 0; i < ind; i++) {
        printf("%d ", ans[i]);
    }

    return 0;
}

/*
The program must accept the coordinates (x, y) of N points as the input. The program must print the lengths of all possible horizontal lines that can be formed using the given N points as the output. The lengths of the horizontal lines must be printed in sorted order. If it is not possible to form horizontal lines, then the program must print -1 as the output.

Notes All N points are always distinct.

Boundary Condition(s):

2<=N<=500

-10 <= x <= 10

Input Format:

The first line contains N.

The next N lines, each contains two integers separated by a space representing the coordinates(x, y) of a point.

Output Format:

The first line contains the integer values separated by a space representing the lengths of all possible horizontal lines that can be formed using the given N points.

Example Input/Output 1:

Input

9

11

-2-1

-23

-11

2-1

03

22

4-1

21

Output

1222346
*/
