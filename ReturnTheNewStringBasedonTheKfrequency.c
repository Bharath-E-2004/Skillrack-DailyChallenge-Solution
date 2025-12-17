#include <stdlib.h>
#include <string.h>

char* reduceCharacterFrequency(char *str, int K)
{
    int len = strlen(str);
    char *result = (char *)malloc(sizeof(char) * (len + 1));

    int freq[256] = {0};
    int j = 0;

    for (int i = 0; i < len; i++) {
        unsigned char ch = str[i];
        if (freq[ch] < K) {
            result[j++] = ch;
        }
        freq[ch]++;
    }

    result[j] = '\0';   // null terminate the string
    return result;
}

/*
The function/method reduceCharacter Frequency accepts two arguments str and K representing a string value and an integer value respectively.

The function/method reduce CharacterFrequency must remove the characters after their kth occurrence in the given string(from left to right). Then the function must return the revised string as a new string.

Your task is to implement the function reduceCharacter Frequency so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

aabbabcdccbab 2

Output: aabbcdc

Explanation:

1

Here the given string is aabbabcdccbab and K=2.

After removing the characters that occur more than 2 times in the given string, the string becomes aabbcdc.

Example Input/Output 2:

Input:

TOOLONGTOURtoolongtour 2

Output

TOOLNGTURtoolngtur
*/
