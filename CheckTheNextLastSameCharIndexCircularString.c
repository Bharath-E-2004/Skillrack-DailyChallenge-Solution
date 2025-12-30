#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void findNextWordPosition(char *str)
{
    char *words[100];
    int count = 0;

    /* Split string into words */
    char *token = strtok(str, " ");
    while (token != NULL)
    {
        words[count++] = token;
        token = strtok(NULL, " ");
    }

    /* For each word, find next word with same last character */
    for (int i = 0; i < count; i++)
    {
        char lastChar = words[i][strlen(words[i]) - 1];
        int j = (i + 1) % count;

        while (j != i)
        {
            if (words[j][strlen(words[j]) - 1] == lastChar)
            {
                printf("%d", j + 1);  // 1-based index
                break;
            }
            j = (j + 1) % count;
        }
    }
}
/*
The function/method find NextWordPosition accepts an argument str. The string str contains multiple words.

The function/method find NextWordPosition must print the output based on the following conditions.

- For each word in the given string, the function must print the position of the next word with the same last character.

- Consider the words in circular fashion when finding the next word with the same last character.

Your task is to implement the function find NextWordPosition so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

pen table desk admin junction rock

Output:

426513

Explanation:

pen -> admin (4th word)

table -> table (2nd word)

desk -> rock (6th word)

admin -> junction (5th word)

junction -> pen (1st word)

rock -> desk (3rd word)

Hence the output is

426513

Example Input/Output 2:

Input one two three four five

Output 32541

16
*/
