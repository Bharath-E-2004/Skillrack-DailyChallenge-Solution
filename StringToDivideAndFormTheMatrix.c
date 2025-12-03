#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef struct {
    int R, C;
    int **matrix;
} boundedArray;

boundedArray* groupIntegersAndFormMatrix(char *str) {

    boundedArray* result = (boundedArray*)malloc(sizeof(boundedArray));

    // Count entries
    int total_len = 0;
    char *tmp = strdup(str);
    char *token = strtok(tmp, " ");
    int maxRow = 0;

    while (token != NULL) {
        int pos = token[strlen(token)-1] - 'a';
        if (maxRow < pos) maxRow = pos;
        total_len++;
        token = strtok(NULL, " ");
    }
    free(tmp);

    int row = maxRow + 1;
    int col = total_len / row;

    result->R = row;
    result->C = col;

    result->matrix = (int**)malloc(sizeof(int*) * row);
    for (int i = 0; i < row; i++) {
        result->matrix[i] = (int*)malloc(sizeof(int) * col);
        for (int j = 0; j < col; j++)
            result->matrix[i][j] = 0;
    }

    // Fill matrix
    for (int i = 0; i < row; i++) {
        char curr = 'a' + i;
        int j = 0;
        tmp = strdup(str);
        token = strtok(tmp, " ");
        
        while (token != NULL) {
            int len = strlen(token) - 1;
            
            if (token[len] == curr) {
                int val = 0;
                for (int k = 0; k < len; k++) {
                    if (isdigit(token[k])) {
                        val = val * 10 + (token[k] - '0');
                    }
                }
                result->matrix[i][j++] = val;
            }
            token = strtok(NULL, " ");
        }
        free(tmp);
    }

    return result;
}

int main(){
    char str[200];
    fgets(str, 200, stdin);
    str[strcspn(str, "\n")] = '\0';  // remove newline

    boundedArray* result = groupIntegersAndFormMatrix(str);

    for(int i=0;i<result->R;i++){
        for(int j=0;j<result->C;j++)
            printf("%d ", result->matrix[i][j]);
        printf("\n");
    }
    return 0;
}


/*
The function/method groupIntegersAndFormMatrix accepts an argument str. The string str contains integer values separated by a space, where each integer ends with a lower case alphabet. The 26 lower case alphabets(a to z) are mapped to the rows numbered from 1 to 26. The lower case alphabet at the end of each integer indicates that the integer belongs to the corresponding row of the integer matrix to be formed (a indicates the integers of the 1st row, b indicates the integers of the 2nd row, and so on).

The function/method groupintegersAndFormMatrix must group the integer values based on the lower case alphabets. In each group, there will be an equal number of integers. Then the function must form an integer matrix using the groups of integers. In each row of the matrix, the integers must be in the order of their occurrence. Finally, the function must return the integer matrix.

Your task is to implement the function groupintegersAndFormMatrix so that it passes all the test cases.

The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray.

int R, C

int matrix;

→ boundedArray;

4

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

90c 308 80c 50b 10a 70c 60b 20a 40b

Output:

33 30 10 20

50 60 40

90 80 70

Explanation:

Group as 30, 10, 20

Group b: 50, 60, 40

Group es 90, 60.70
*/
