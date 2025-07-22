#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

char* hexCodeToString(char* hexCode) {
    char* letter = (char*)malloc(sizeof(char) * strlen(hexCode)); // Allocate enough memory
    char* token = strtok(hexCode, " ");
    int ind = 0;

    while (token != NULL) {
        long long int sum = 0;
        int len = strlen(token);

        for (int i = 0; i < len; i++) {
            char ch = tolower(token[i]); // Handle uppercase hex digits
            int val = isalpha(ch) ? (ch - 'a') + 10 : (ch - '0');
            sum = sum * 16 + val;
        }

        letter[ind++] = (char)sum;
        token = strtok(NULL, " ");
    }

    letter[ind] = '\0'; // Null-terminate the string
    return letter;
}
/*
The function/method hexCodeToString accepts an argument hexCode. The string hexCode contains the hex codes of all the characters of a string separated by a space.

The function/method hexCodeToString must find the string value from the given hex codes and return the resulting string.

Note: The string hexCode contains the hex codes of alphabets, digits and space characters.

Your task is to implement the function hexCodeToString so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

73 6b 69 6c 6c 72 61 63 6b

Output:

skillrack

Explanation:

Here the given string is 73 6b 69 6c 6c 72 61 63 6b.

After converting the hex codes to characters, the string becomes skillrack.

Example Input/Output 2:

Input:

48 65 6c 6c 6f 20 50 65 74 65 72

Output

Hello Peter
*/
