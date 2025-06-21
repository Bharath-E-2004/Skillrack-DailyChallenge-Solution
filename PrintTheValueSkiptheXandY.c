#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, X, Y, val;
    scanf("%d %d %d", &N, &X, &Y);

    for (int ctr = 1; ctr <= N; ctr++) {
        scanf("%d", &val);

        for (int printVal = 1; printVal < val; printVal++) {
            if (printVal >= X && printVal <= Y) {
                continue; // Skip values >= X and Y
            }
            printf("%d ", printVal);
        }

        printf("\n");
    }

    return 0;
}
/*
  The program must accept N integers and two integers X, Y as the input. For each integer K among the given N integers, the program must print the integers from 1 to K except the integers from X to Y. Please fill in the blanks with code so that the program runs successfully.

Input Format:

The first line contains N, X and Y separated by a space.

The second line contains N integers separated by a space.

Output Format:

The first N lines containing the integer values based on the given conditions.

Example Input/Output 1:

Input:

55 10

20 3 10 8 15

Output:

1 2 3 4 11 12 13 14 15 16 17 18 19 20

123

1234

1234

1 2 3 4 11 12 13 14 15

Explanation:

Here N5, X = 5 and Y = 10.

1st integer: 20 -> 1 2 3 4 11 12 13 14 15 16 17 18

19

2nd integer: 3 -> 123

3rd integer:

10->1234

4th integer: 8->1234

5th integer: 15 -> 1 2 3 4 11 12 13 14 15

20
*/
