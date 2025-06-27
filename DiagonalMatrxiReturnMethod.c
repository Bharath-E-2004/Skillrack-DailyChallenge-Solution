#include <stdio.h>
#include <stdlib.h>

// Define the struct
typedef struct BoundedArray {
    int SIZE;
    int *arr;
} BoundedArray;

// Function to get the X-th diagonal from a matrix
BoundedArray* getXthDiagonal(int r, int c, int matrix[r][c], int x) {
    int startRow, startCol;

    if (x < c) {
        startRow = 0;
        startCol = x;
    } else {
        startRow = x - c + 1;
        startCol = c - 1;
    }

    BoundedArray *result = (BoundedArray *)malloc(sizeof(BoundedArray));
    result->arr = (int *)malloc(sizeof(int) * (r + c)); // Max diagonal length
    int ind = 0;

    while (startRow < r && startCol >= 0) {
        result->arr[ind++] = matrix[startRow][startCol];
        startRow++;
        startCol--;
    }

    result->SIZE = ind;
    return result;
}

int main() {
    int R, C, X;
    scanf("%d %d", &R, &C);

    int matrix[R][C];
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            scanf("%d", &matrix[row][col]);
        }
    }

    scanf("%d", &X);

    BoundedArray *bArr = getXthDiagonal(R, C, matrix, X);

    printf("Diagonal %d:\n", X);
    for (int index = 0; index < bArr->SIZE; index++) {
        printf("%d ", bArr->arr[index]);
    }

    // Free allocated memory
    free(bArr->arr);
    free(bArr);

    return 0;
}
/*
 The function/method getXthDiagonal accepts four arguments R, C, matrix and X. The integers R and C represent the size of the integer matrix. The integer X represents the position of a top-left to bottom-right diagonal.

The function/method getXthDiagonal must return an integer array containing the integers in the Xth top-left to bottom-right diagonal of the given matrix. The top-left to bottom-right diagonals are numbered from the bottom-left cell of the matrix.

Your task is to implement the function getXthDiagonal so that it passes all the test cases.

The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray.

{

int SIZE;

int arr;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

2 <= R, C <= 50

1 <= x <= R+C-1

Example Input/Output 1:

Input:

65

89 56 81 32 15

48 30 71 23 94

39 28 18 75 14

19 33 57 91 95

93 70 80 59 60

32 73 36 69 83

7

Output:

Diagonal 7:56 71 75 95
*/
