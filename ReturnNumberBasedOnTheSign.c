#include <stdio.h>
#include <stdlib.h>

int getProductSign(int SIZE, int arr[]) {
    int prod = 1;

    for (int i = 0; i < SIZE; i++) {
        if (arr[i] == 0)
            return 0;
        prod *= (arr[i] < 0 ? -1 : 1);
    }

    return prod;
}

int main() {
    int N;
    scanf("%d", &N);

    int arr[N];  // Variable-length array (C99 feature)

    for (int index = 0; index < N; index++) {
        scanf("%d", &arr[index]);
    }

    printf("%d", getProductSign(N, arr));
    return 0;
}

/*
The function/method getProductSign accepts two arguments - SIZE and arr. The integer SIZE represents the size of the integer array arr.

The function/method getProductSign must return the sign of the product of all the integers in the given array.

- If the product is a positive value, then the function must return 1.

- If the product is a negative value, then the function must return -1.

- If the product is 0, then the function must return 0.

Your task is to implement the function getProductSign so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1<=N<=1000

-100 <= Each integer value <= 100

Example Input/Output 1:

Input:

4

-123-4

Output

1

Explanation:

The product of the given four integers is 24 (-1*2*3-4).

Here 24 is a positive value, so 1 is printed.

Example Input/Output 2:

Input:

5

10 20-30 4.5

Output

-1
*/
