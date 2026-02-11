#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* removeReversedWords(char *str1, char *str2) {

    // Allocate memory for result
    char *result = (char*)malloc(strlen(str1) + 1);
    result[0] = '\0';  // initialize as empty string

    // Create reverse of str2
    int len2 = strlen(str2);
    char *reverse = (char*)malloc(len2 + 1);

    for (int i = 0; i < len2; i++) {
        reverse[i] = str2[len2 - 1 - i];
    }
    reverse[len2] = '\0';

    // Tokenize str1
    char *token = strtok(str1, " ");
    int found = 0;

    while (token != NULL) {

        if (strcmp(token, str2) != 0 && strcmp(token, reverse) != 0) {
            strcat(result, token);
            strcat(result, " ");
            found = 1;
        }

        token = strtok(NULL, " ");
    }

    free(reverse);

    // If nothing left
    if (!found) {
        strcpy(result, "-1");
        return result;
    }

    // Remove last extra space
    result[strlen(result) - 1] = '\0';

    return result;
}

/*
The function/method removeReversedWords accepts two arguments stri and str2 representing two string values. The string str1 contains multiple words separated by a space. The string stra contains exactly one word.

The function/method removeReversedWords must remove all the occurrences of the word str2 and its reverse in the string str1. Then the function must return the revised string as a new string. If the string becomes empty, then the function must return -1 as a string.

Your task is to implement the function removeReversedWords so that the program runs successfully.

IMPORTANT; Do not write the main() function as it is already defined.

Example Input/Output 11

Input:

nightingale lion tiger mosquito noil cockroach lion fox panda lizard lion

Output:

nightingale tiger mosquito cockroach fox panda lizard

Explanation:

After removing all the occurrences of "lion" and its reverse in the first string, the string becomes

nightingale tiger mosquito cockroach fox panda lizard

Example Input/Output 21

Input:

monkey monkey yeknom monkey yeknom yeknom

Output:

1
*/
