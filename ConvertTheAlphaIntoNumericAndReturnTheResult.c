#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int *arr;
    int SIZE;
} boundedArray;

boundedArray alphabetsToIntegers(char *str) {
    boundedArray result;
    result.arr = (int *)malloc(sizeof(int) * 1000); // Allocate space for up to 1000 integers
    int i = 0;

    printf("%s\n", str);

    char *token = strtok(str, " ");
    while (token != NULL) {
        int j = 0, val = 0, neg = 1;

        if (token[j] == '-') {
            neg = -1;
            j++;
        }

        while (token[j] != '\0') {
            val = val * 10 + (token[j++] - 'a');
        }

        result.arr[i++] = val * neg;
        token = strtok(NULL, " ");
    }

    result.SIZE = i;
    return result;
}

int main() {
    char input[1000];
    fgets(input, sizeof(input), stdin);
    input[strcspn(input, "\n")] = '\0'; // Remove trailing newline if present

    boundedArray result = alphabetsToIntegers(input);

    for (int i = 0; i < result.SIZE; i++) {
        printf("%d ", result.arr[i]);
    }

    free(result.arr);
    return 0;
}

/*
The function/method alphabets Tointegers accepts an argument str. The string str contains only alphabets(a-j) and minus symbol(-). The alphabets from a to j indicate the digits from to 9 respectively. The minus symbol(-) indicates the sign of an integer.

The function/method alphabets Tointegers must form integers from the given alphabets and return the resulting integers as an array.

Your task is to implement the function alphabets Tointegers so that it passes all the test cases.

The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray

int SIZE;

int arr;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

bc dff eaaj-hi

Output:

12 355 4009-78

Explanation:

bc-> 12 dff -> 355 eaaj -> 4009

-hi->-78

Example Input/Output 2:

Input:

-aaae-gab ajai

Output: -4-601 908
*/
