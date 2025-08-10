#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* getAbbreviation(char* str) {
    if (str == NULL) return NULL;

    // Allocate memory for the result (max possible abbreviation is length of str)
    char* result = (char*)malloc(strlen(str) + 1);
    if (result == NULL) return NULL;

    int ind = 0;
    char* token = strtok(str, " ");

    while (token != NULL) {
        result[ind++] = toupper(token[0]);
        token = strtok(NULL, " ");
    }

    result[ind] = '\0'; // Null-terminate the result string
    return result;
}


/*
The function/method getAbbreviation accepts an argument str representing a string value which contains multiple words.

The function/method getAbbreviation must find the abbreviation for the given words by concatenating the first alphabet of each word. Then the function must return the abbreviated string, where all the alphabets must be in upper case.

Your task is to implement the function getAbbreviation so that the program runs successfully.

ETIMMT Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

Automated teller machine

Output

ATM

Explanation:

Here the given string is Automated teller machine.

After concatenating the first alphabet of each word in upper case, the abbreviated string becomes ATM.

Example Input/Output 2:

Input

Laughing Out Loud

Output:

LOL

Example Input/Output 3:

Input:

For Life and Beyond

Output:

FLAB
*/
