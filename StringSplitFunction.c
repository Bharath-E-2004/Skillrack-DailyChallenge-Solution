#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

char* splitEvenLengthWords(const char *str) {
    char temp[1000];
    strcpy(temp, str);  // make a modifiable copy

    char *word = strtok(temp, " ");
    char *result = (char *)malloc(2000); // enough space
    result[0] = '\0';  // initialize empty result string

    while (word != NULL) {
        int len = strlen(word);
        if (len % 2 == 0) {
            // split the word into two halves
            strncat(result, word, len / 2);
            strcat(result, " ");
            strcat(result, word + len / 2);
        } else {
            strcat(result, word);
        }
        strcat(result, " ");
        word = strtok(NULL, " ");
    }

    // remove trailing space
    int rlen = strlen(result);
    if (rlen > 0 && result[rlen - 1] == ' ')
        result[rlen - 1] = '\0';

    return result;
}
/*
  function splitEvenLength Words

The function/method splitEvenLength Words accepts an argument str that represents a string value containing multiple words.

The function/method splitEvenLengthWords must split each even length word into two equal halves in the given string. Then the function must return a new string indicating the resulting string.

Your task is to implement the function splitEvenLength Words so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

Monday January Leapyear calendar day

Output

Mon day January Leap year cale ndar day

Explanation:

Here the given string is Monday January Leapyear calendar day.

The even length words in the given string are Monday, Leapyear and calendar. After dividing the even length words into two equal halves, the string becomes Mon day January Leap year cale ndar day

Example Input/Output 2:

Input

one two three four five

Output:

one two three fo ur fi ve
*/
