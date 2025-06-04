#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Given struct definition (already in the platform)
typedef struct {
    int SIZE;
    char **words;
} boundedArray;

boundedArray* customSplit(char *str, char delimiter) {
    boundedArray *result = (boundedArray *)malloc(sizeof(boundedArray));
    result->SIZE = 0;
    result->words = (char **)malloc(sizeof(char *) * 100); // Assume max 100 splits

    int len = strlen(str);
    int start = 0;

    for (int i = 0; i <= len; ++i) {
        if (str[i] == delimiter || str[i] == '\0') {
            int wordLen = i - start;
            if (wordLen > 0) {
                char *word = (char *)malloc(wordLen + 1);
                strncpy(word, &str[start], wordLen);
                word[wordLen] = '\0';
                result->words[result->SIZE++] = word;
            }
            start = i + 1;
        }
    }

    return result;
}

/*
  typedef struct BoundedArray

int SIZE

char words, → boundedArray,

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 11

Input:

codeblocks

Output:

Words:

C

debl

ks

Explanation:

The given string is codeblocks and the delimiter is o.

After splitting the string based on the delimiter, the words are

C

debl

cks

Example Input/Output 2:

Input:

Illskillrackill
l
Output:

Words:

ski

rack
  */
