#include <string.h>
#include <stdlib.h>

int containsConcatenatedWord(char *str)
{
    char *words[100];
    int count = 0;

    // Copy input string (to avoid modifying original)
    char *copy = strdup(str);

    // Split into words
    char *token = strtok(copy, " ");
    while (token != NULL) {
        words[count++] = token;
        token = strtok(NULL, " ");
    }

    // Check all pairs
    for (int i = 0; i < count; i++) {
        for (int j = 0; j < count; j++) {
            if (i == j) continue;

            char temp[200];
            strcpy(temp, words[i]);
            strcat(temp, words[j]);

            // Check against every word
            for (int k = 0; k < count; k++) {
                if (strcmp(temp, words[k]) == 0) {
                    free(copy);
                    return 1;
                }
            }
        }
    }

    free(copy);
    return 0;
}
/*
The function/method contains ConcatenatedWord accepts an argument str. The string str contains multiple words separated by a space.

The function/method containsConcatenatedWord must return 1 if the given str contains a word which is equal to the concatenation of any two words in any order. Else the function must return 0.

Your task is to implement the function contains ConcatenatedWord so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

rat lion cat ratcat tiger

Output:

1

Explanation:

rat + cat = ratcat, which is equal to the 4th word in the given string.

Hence 1 is printed.

Example Input/Output 2:

Input:

rat lion cat ratcatpig tiger

Output 0

Example Input/Output 3:

Input:

zebra fox monkey donkey wolf donkeyfox

Output: 1
*/
