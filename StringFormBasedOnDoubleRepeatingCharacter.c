#include <stdio.h>
#include <string.h>

void splitStringSameCharacters(char *str)
{
    int i = 0, len = strlen(str);

    while (i < len) {
        char curr = str[i];
        int count = 0;
        int start = i;

        // count consecutive characters
        while (i < len && str[i] == curr) {
            i++;
            count++;
        }

        // if exactly two consecutive characters → split
        if (count == 2) {
            // print first character
            printf("%c ", curr);

            // print second character
            printf("%c", curr);
        } 
        else {
            // print normally
            for (int j = 0; j < count; j++) {
                printf("%c", curr);
            }
        }
    }
}

/*
The function/method splitStringSameCharacters accept an argument str representing a string value.

The function/method splitStringSameCharacters must split the given string at which a character occurs exactly twice consecutively. Then the function must print the resulting words as the output.

Your task is to implement the function splitStringSameCharacters so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

moonlighttiger

Output:

mo onlight tiger

Explanation:

Here the given string is moonlighttiger.

The characters 'o' and 't' occur exactly twice consecutively.

After splitting the string at which the characters occur exactly twice consecutively, the string becomes

mo onlight tiger

Example Input/Output 2:

Input:

aabbbccddddeeeeeeffgggg

Output:

a abbbc cddddeeeeeef fgggg
*/
