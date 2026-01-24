#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    int merged[N / 2];
    int k = 0;

    // Merge every two numbers
    for (int i = 0; i < N; i += 2) {
        int x = arr[i];
        int y = arr[i + 1];

        int xh = x / 100, yh = y / 100;
        int xt = (x / 10) % 10, yt = (y / 10) % 10;
        int xo = x % 10, yo = y % 10;

        int result = 0;

        result = result * 10 + (xh > yh ? xh : yh);
        result = result * 10 + (xh > yh ? yh : xh);

        result = result * 10 + (xt > yt ? xt : yt);
        result = result * 10 + (xt > yt ? yt : xt);

        result = result * 10 + (xo > yo ? xo : yo);
        result = result * 10 + (xo > yo ? yo : xo);

        merged[k++] = result;
    }

    // INSERTION SORT
    for (int i = 1; i < N / 2; i++) {
        int key = merged[i];
        int j = i - 1;

        while (j >= 0 && merged[j] > key) {
            merged[j + 1] = merged[j];
            j--;
        }
        merged[j + 1] = key;
    }

    // Print output
    for (int i = 0; i < N / 2; i++) {
        printf("%d ", merged[i]);
    }

    return 0;
}

/*
The program must accept N three-digit integers as the input. The value of N is always even.

The program must form N/2 integers by merging every two integers (X, Y) among the given N integers based on the following condition.

- The order of digits in the resulting integer from merging X and Y must be as follows.

Largest digit in hundreds place, Smallest digit in hundreds place, Largest digit in tens place, Smallest digit in tens place, Largest digit in ones place, Smallest digit in ones place.

Finally, the program must print the N/2 integers in sorted order.

Boundary Condition(s):

2 <= N <= 100

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains the N/2 integers in sorted order separated by a space.

Example Input/Output 1:

Input:

4

123 654 237 195

Output:

219375 615243

Explanation:

123 and 654 can be merged as 615243.

237 and 195 can be merged as 219375.

So the resulting two integers are printed in sorted order.

Example Input/Output 2:

Input:

6 856 202 100 504 250 712

Output

510040 725120 825062
*/
