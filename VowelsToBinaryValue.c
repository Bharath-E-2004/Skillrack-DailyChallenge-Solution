#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

int findVowelsBitMask(char str[]) {
    int vowels[5] = {0}; // a, e, i, o, u

    for (int i = 0; i < strlen(str); i++) {
        char ch = tolower(str[i]);
        if (ch == 'a') vowels[0] = 1;
        else if (ch == 'e') vowels[1] = 1;
        else if (ch == 'i') vowels[2] = 1;
        else if (ch == 'o') vowels[3] = 1;
        else if (ch == 'u') vowels[4] = 1;
    }

    int result = 0;
    for (int i = 0; i < 5; i++) {
        result += vowels[i] * (1 << i); // equivalent to pow(2, i)
    }

    return result;
}
/*
The function/method findVowels BitMask accepts an argument str representing a string value.

The function/method findVowelsBitMask must return an integer value X whose binary representation indicates the presence of vowels in the given string by ignoring case. The 5 vowels (aeiou or AEIOU) are mapped to 5 bits in the binary representation of X starting from LSB(least significant bit). The presence of the vowels must be indicated by the set bits in the binary representation of X.

Your task is to implement the function findVowels BitMask so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

SkillRack

Output: 5

Explanation:

There are two vowels 'i' and 'a' in the string "SkillRack".

So the binary representation of X = 00101.

The 1st bit from LSB indicates the presence of the vowel 'a'.

The 3rd bit from LSB indicates the presence of the vowel 'I'.

The decimal equivalent of 00101 is 5.

Example Input/Output 2:

Input Archaeologist

Output: 15
*/
