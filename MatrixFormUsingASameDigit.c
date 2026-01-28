boundedArray* getMatrixWithx(int R, int C, int X)
{
    boundedArray *result = (boundedArray*)malloc(sizeof(boundedArray));

    result->R = R;
    result->C = C;

    // Allocate memory for row pointers
    result->matrix = (int**)malloc(sizeof(int*) * R);

    for (int i = 0; i < R; i++)
    {
        // Allocate memory for each row
        result->matrix[i] = (int*)malloc(sizeof(int) * C);

        for (int j = 0; j < C; j++)
        {
            result->matrix[i][j] = X;
        }
    }

    return result;
}

/*
The function/method getMatrixWithx accepts three arguments R, C and X. The integers R and C represent the size of the integer matrix to be formed. The integer X represents the value to be filled in the matrix.

The function/method getMatrixWithx must form an integer matrix of size R°C. Then the function must initialize each integer with X in the matrix. Finally, the function must return the matrix.

Your task is to implement the function getMatrixWithx so that it passes all the test cases.

The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray

{

int R, C

int **matrix;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

45 10

Output:

10 10 10 10 10

10 10 10 10 10

10 10 10 10 10

10 10 10 10 10

Explanation:

Here R-4, C-5 and X-10.

So the integer matrix is formed with the size 4°5 then the matrix is filled with the integer value 10.

Hence the output is

10 10 10 10 10

10 10 10 10 10

10 10 10 10 10

10 10 10 10 10

Example Input/Output 2:

Input:

53-50

Output:

-50-50-50

-50-50-50

-50-50-50

-50-50-50

-50-50-50
*/
