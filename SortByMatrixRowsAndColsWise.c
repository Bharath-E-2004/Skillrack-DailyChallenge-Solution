#include <stdio.h>
#include <stdlib.h>

void sortRowsAndCols(int R, int C, int *matrix) {
    // Sort each row
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C - 1; j++) {
            for (int k = j + 1; k < C; k++) {
                // Calculate the correct indices
                if (*(matrix + i * C + j) > *(matrix + i * C + k)) {
                    int temp = *(matrix + i * C + j);
                    *(matrix + i * C + j) = *(matrix + i * C + k);
                    *(matrix + i * C + k) = temp;
                }
            }
        }
    }

    // Sort each column
    for (int j = 0; j < C; j++) {
        for (int i = 0; i < R - 1; i++) {
            for (int k = i + 1; k < R; k++) {
                // Calculate the correct indices
                if (*(matrix + i * C + j) > *(matrix + k * C + j)) {
                    int temp = *(matrix + i * C + j);
                    *(matrix + i * C + j) = *(matrix + k * C + j);
                    *(matrix + k * C + j) = temp;
                }
            }
        }
    }
}

int main() {
    int R, C;

    scanf("%d %d", &R, &C);
    
    // Dynamically allocate memory for the matrix as a 1D array
    int *matrix = (int *)malloc(R * C * sizeof(int));

    // Input the matrix values
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            scanf("%d", (matrix + row * C + col));  // Input using pointer arithmetic
        }
    }

    // Sort the rows and columns
    sortRowsAndCols(R, C, matrix);

    // Output the sorted matrix
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            printf("%d ", *(matrix + row * C + col));  // Output using pointer arithmetic
        }
        printf("\n");
    }

    // Free the dynamically allocated memory
    free(matrix);

    return 0;
}
/*
The function/method sortRowsAndColumns accepts three arguments R, C and matrix. The first two arguments R and C represent the size of an integer matrix. The third argument matrix represents a pointer to the R°C integer matrix.

The function/method sortRowsAndColumns must sort the integers in each row. Then the function must sort the integers in each column of the given matrix.

Your task is to implement the function sortRowsAnd lumns so that the programaruns successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

45

96 66 74 60 18

42 12 96 62 15

68 29 64 92 24

60 44 37 61 53

Output

12 15 42 60 61

18 29.53 62 92

24:44 64.68 96

37 60 66 74 96

Example Input/Output 2:

Input:

5 5

79 26 81 79 75

91 88 54 36 45

25 73 47 46 83

56 21 25 12 50

47 22 52 74 69

Output:

12 21 25 50 56

22 45 47 69 74

25 46 52 73 81

26 47 54 79 83

36 75 79 88 91

*/
