#include <stdio.h>
#include <string.h>

int main()
{
    int row, col, val;
    scanf("%d %d", &row, &col);

    long long sumCol[col];
    memset(sumCol, 0, sizeof(sumCol));

    long long total = 0;

    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            scanf("%d", &val);
            sumCol[j] += val;
            total += val;
        }
    }

    long long currSum = 0;
    for(int i = 0; i < col - 1; i++){
        currSum += sumCol[i];
        if(currSum*2 == total){
            printf("YES");
            return 0;
        }
    }

    printf("NO");
    return 0;
}
/*
The program must accept an integer matrix of size R°C as the input. The program must print YES if the given matrix is balanced vertically. Else the program must print NO as the output. The vertically balanced matrix is a matrix where the sum of the integers on the left part and right part are equal when the matrix is divided vertically.

Boundary Condition(s):

2 <= R, C <= 50 1 <= Matrix element value <= 10^5

Input Format:

The first line contains R and C separated by a space. The next R lines each contains C integers separated by a space.

Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

44

10445

10 534

20 3 5 3

10 626

Output:

YES

Explanation:

If the matrix is divided vertically as given below, then the sum of integers on the left part and right part are equal.

10/445

10 534

20 353

10/626

The sum of integers on the left part is 50.

The sum of integers on the right part is 50.

Hence the matrix is a vertically balanced matrix.
*/
