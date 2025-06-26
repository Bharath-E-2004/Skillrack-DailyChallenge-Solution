#include <stdio.h>
#include <stdlib.h>

int main() {
    char str[101];
    scanf("%s", str);

    int X = 0;
    for (int index = 0; str[index] != '\0'; index++) {
        X |= (1 << (str[index] - 'a'));
    }

    printf("%d", X);
    return 0;
}
/*
The program must accept a string S containing only lower case alphabets as the input. The program must generate an integer X whose binary representation indicates the presence of unique alphabets in S. The 26 lower case alphabets (a-z) are mapped to 26 bits in the binary representation of X from LSB(least significant bit) to MSB(most significant bit). The presence of the alphabets must be indicated by the set bits in the binary representation of X. Finally, the program must print the value of X as the output. Please fill in the blanks with code so that the program runs successfully.

Input Format: The first line contains S.

Output Format:

The first line contains an integer value X.

Example Input/Output 1:

Input: skillrack

Output: 396549

Explanation:

The binary representation of X and the alphabets mapping are given below.

00000001100000110100000101 zyxwvutsrqponmikjihgfedcba

The decimal equivalent for 1100000110100000101 is 396549.

Example Input/Output 2:

Input: abcd

Output: 15
*/
