#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* multiplyOrRepeat(char *str)
{
    char left[100], right[100];
    int i = 0, j = 0;

    // Split input by '*'
    while (str[i] != '*' && str[i] != '\0')
        left[j++] = str[i++];
    left[j] = '\0';

    i++;  // skip '*'
    j = 0;
    while (str[i] != '\0')
        right[j++] = str[i++];
    right[j] = '\0';

    // Check if both sides are numbers
    int isLeftNum = 1, isRightNum = 1;

    for (i = 0; left[i]; i++)
        if (!isdigit(left[i])) isLeftNum = 0;

    for (i = 0; right[i]; i++)
        if (!isdigit(right[i])) isRightNum = 0;

    // Case 1: number * number
    if (isLeftNum && isRightNum)
    {
        char result = (char)malloc(20);
        sprintf(result, "%d", atoi(left) * atoi(right));
        return result;
    }

    // Case 2: word * number OR number * word
    char *word;
    int count;

    if (isLeftNum)
    {
        count = atoi(left);
        word = right;
    }
    else
    {
        count = atoi(right);
        word = left;
    }

    int wordLen = strlen(word);

    // Allocate exact memory (+ spaces + null)
    char result = (char)calloc(count * (wordLen + 1), sizeof(char));

    char *ptr = result;
    for (i = 0; i < count; i++)
    {
        memcpy(ptr, word, wordLen);
        ptr += wordLen;

        // Space between repetitions (needed for Skill Rack case)
        if (i < count - 1)
            *ptr++ = ' ';
    }

    *ptr = '\0';
    return result;
}
/*
[13-12-2025 20:33] Bharath. E: The function/method multiplyOrRepeat accepts an argument str. The string str contains two positive integers(X, V) separated by an asterisk or a word(W) and a positive integer(N) separated by an asterisk.

The function/method multiplyOrRepeat must return a string based on the following conditions.

- If the given string contains two integers, then the function must return their product as a string.

- Else the function must form a string by repeating the word N times. Then the function must return the resulting string.

Your task is to implement the function multiplyOrRepeat so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

15*120

Output:

1800

Explanation:

The given string contains two integers (15 and 120) separated by an asterisk.

So their product is printed as the output.

Example Input/Output 2:

Input:

Skill 4

Output

SkillSkillSkillSkill

Explanation:

The given string contains a word and an integer("Skill" and 4) separated by an asterisk. So the word "Skill" is repeated 4 times.
[13-12-2025 20:33] Bharath. E: Example Input/Output 3:

Input:

10*CSE

Output:

CSECSECSECSECSECSECSECSECSECSE

*/
