#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

    int index[256];
    char K[27], S[1001];

    scanf("%s", K);
    scanf("%s", S);

    // Store index of each character in keyboard
    for (int i = 0; i < 26; i++) {
        index[(unsigned char)K[i]] = i;
    }

    long long total = 0;
    char prev = S[0];

    for (int i = 1; i < strlen(S); i++) {
        total += abs(index[(unsigned char)prev] - index[(unsigned char)S[i]]);
        prev = S[i];
    }

    printf("%lld", total);

    return 0;
}
/*
The program must accept a string K containing all 26 lower case alphabets representing the keys in a keyboard as the input. All the keys in the keyboard are arranged in a row. A boy wants to type the string S using the keyboard. The value of S is also passed as the input to the program. The program must find the total seconds required to type the string S based on the following conditions.

- Initially, the boy is pointing to the key that he wants to type first (i.e., The first alphabet of the string S).

- The boy can only move from the current key to its adjacent keys.

- Moving from the current key to its adjacent keys(possibly two adjacents) take 1 second.

- To press any key it takes 0 seconds.

Finally, the program must print the total number of seconds required to type the string S as the output.

Boundary Condition(s): 1<= Length of S <= 1000

Input Format:

The first line contains K.

The second line contains S.

Output Format:

The first line contains an integer value representing the total number of seconds required to type the string S based on the given conditions.

Example Input/Output 1:

Input:

abcdefghijklmnopqrstuvwxyz

notebook

Output: 41
*/
