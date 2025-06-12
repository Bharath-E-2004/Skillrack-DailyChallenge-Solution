#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, X, Y;
    scanf("%d %d %d", &N, &X, &Y);

    for (int val = 1; val <= N; val++) {
        if (val % X == 0 || val % Y == 0) {
            continue;
        }
        printf("%d ", val);
    }

    return 0;
}
/*
   The program must accept three integers N, X and Y as the input. The program must print the integers from 1 to N except the multiples of X and Y as the output. Please fill in the blanks with code so that the program runs successfully.

Example Input/Output 1:

Input:

25 5 7

Output:

1 2 3 4 6 8 9 11 12 13 16 17 18 19 22 23 24

Explanation:

Here N = 25, X = 5 and Y = 7.

The integers from 1 to 25 except the multiples of 5 and 7 are printed as the output 1 2 3 4 6 8 9 11 12 13 16 17 18 19 22 23 24

Example Input/Output 2:

Input

20 10 3

Output:

1 2 4 5 7 8 11 13 14 16 17 19
*/
