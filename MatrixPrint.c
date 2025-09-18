#include <stdio.h>
#include <stdlib.h>

void printEveryRowCharacters(int R, int C, char *matrix) {
    for (int i = 0; i < R; i++) {
        for (int j = i; j < C; j += i + 1) {
            printf("%c ", *(matrix+i*C+j));
        }
    }
} // End of printEveryRowCharacters function

int main() {
    int R, C;
    scanf("%d %d", &R, &C);

    char matrix[R][C];

    // Consume newline after reading R and C
    getchar();

    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            scanf("%c", &matrix[row][col]);
        }
        // Consume newline after each row
        getchar();
    }

    printEveryRowCharacters(R, C, matrix);

    return 0;
} // End of main() function
/*
The function/method printEveryRowCharacters accepts three arguments R, C and matrix. The integers R and C represents the size of the character matrix.

The function/method printEveryRowCharacters must print the characters of the matrix based on the following conditions.

- In the 1st row, the function must print every character.

- In the 2nd row, the function must print every 2nd character.

- In the 3rd row, the function must print every 3rd character.

- Similarly, the characters in the remaining rows of the matrix must be printed.

Your task is to implement the function printEveryRowCharacters so that the program runs successfully.

MIPORANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

79

fnmdhbocr

ioumgxyum

togmnpeyw

opjaggksi

xyzqxabsw

poreicarb

czcbelumf

Output

fnmdhbocromxugpwasxCU

Example Input/Output 2:

Input:

55

abcde

fghij

kimno

pqrst

uvwxy

Output:

abcdegimsy

Example Input/Output 3:

Input:

53

ves

fkw

ueq

qmr

gpl

Output:

veskq
*/
