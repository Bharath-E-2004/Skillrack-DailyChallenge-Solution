#include <stdio.h>

int main() {
    int R, C;
    scanf("%d %d", &R, &C);

    char mat[R][C];

    // Read matrix (no spaces in each row)
    for (int i = 0; i < R; i++) {
        scanf("%s", mat[i]);
    }

    int K;
    scanf("%d", &K);

    int subRows = R / K;
    int subCols = C / K;
    int totalSubs = subRows * subCols;

    // Frequency of characters in each submatrix
    int freq[totalSubs][128];
    for (int i = 0; i < totalSubs; i++)
        for (int j = 0; j < 128; j++)
            freq[i][j] = 0;

    int idx = 0;

    // Build frequency table for each K×K submatrix
    for (int sr = 0; sr < R; sr += K) {
        for (int sc = 0; sc < C; sc += K) {

            for (int i = 0; i < K; i++) {
                for (int j = 0; j < K; j++) {
                    unsigned char ch = mat[sr + i][sc + j];
                    freq[idx][ch]++;
                }
            }
            idx++;
        }
    }

    // Find characters present in ALL submatrices
    int result = 0;

    for (int ch = 0; ch < 128; ch++) {
        int ok = 1;
        for (int s = 0; s < totalSubs; s++) {
            if (freq[s][ch] == 0) { 
                ok = 0;
                break;
            }
        }
        if (ok)
            result++;
    }

    printf("%d", result);

    return 0;
}

/*
The program must accept a character matrix of size R°C and an integer K as the input. The values of R and C are always divisible by K. The program must print the count of common characters in all the K*K submatrices of the given matrix.

Boundary Condition(s):

2<=R, C <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C characters separated by a space.

The (R+2)nd line contains K.

Output Format:

The first line contains an integer representing the count of common characters in all the K*K submatrices of the given matrix.

Example Input/Output 1:

Input:

69

sbkgsywgf

rgyeqjjas

smsaszsle

usquehsss

gsfhssesg

xdrhgysss

3

Output:

2
*/
