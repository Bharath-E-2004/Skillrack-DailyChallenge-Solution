#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, X, Y, val;
    scanf("%d %d %d", &N, &X, &Y);

    for (int ctr = 1; ctr <= N; ctr++) {
        scanf("%d", &val);
        for (int printVal = val; printVal >= 1; printVal--) {
            if (printVal % X == 0 || printVal % Y == 0) {
                break;
            }
            printf("%d ", printVal);
        }
        printf("\n");
    }

    return 0;
}
/*
  The program must accept N integers and two integers X, Y as the input. For each integer K among the given N integers, the program must print the integers from K to 1 if there is no multiple of X and Y. Else the program must print the integers from K to the multiple of X or Y. Please fill in the missing lines of code so that the program runs successfully.

Example Input/Output 1:

Input

4 10 5

29 14 35 4

Output:

29 28 27 26 25

14 13 12 11 10

35

4 3 2 1

Example Input/Output 2:

Input

5 50 60

135 110 20 55 70

Output

135 134 133 132 131 130 129 128 127 126 125 124 123 122 121

110 109 108 107 106 105 104 103 102 101 100

120

20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 54321

55 54 53 52 51 50

70 69 68 67 66 65 64 63 62 61 60
*/
