#include <stdio.h>

int main() {
    int R, C;
    scanf("%d %d", &R, &C);

    long long matrix[R][C];

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            scanf("%lld", &matrix[i][j]);

            if (i > 0)
                matrix[i][j] += matrix[i - 1][j];

            if (j > 0)
                matrix[i][j] += matrix[i][j - 1];

            if (i > 0 && j > 0)
                matrix[i][j] -= matrix[i - 1][j - 1];
        }
    }

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            printf("%lld ", matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}

/*
The program must accept an integer matrix of size R°C as the input. The program must find all possible submatrices starting from the top-left cell of the given matrix. Then the program must print the sum of each submatrix as shown in the Example Input/Output section.

Hint: Optimize your logic to avoid Time Limit Exceeded Error.

Boundary Condition(s):

2 <= R, C <= 500

1<= Matrix element value <= 10^4

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space representing the R°C matrix.

Output Format:

The first R lines, each contains C integers separated by a space representing the of submatrices sum based on the given conditions.

Example Input/Output 1:

Input:

33

123

456

789

Output:

136

5 12 21

12 27 45
*/
