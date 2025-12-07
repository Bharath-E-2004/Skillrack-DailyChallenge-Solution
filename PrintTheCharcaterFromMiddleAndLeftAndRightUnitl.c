#include <stdio.h>
#include <string.h>

int main() {
    char S[102];
    scanf("%s", S);

    int n = strlen(S);
    int mid = n / 2;

    int l = mid - 1;
    int r = mid + 1;

    int alpha[256] = {0};

    // Print middle character
    printf("%c", S[mid]);
    alpha[(unsigned char)S[mid]]++;

    while (1) {
        int printed = 0;

        // Print left character
        if (l >= 0) {
            if (alpha[(unsigned char)S[l]] == 1) break;
            printf("%c", S[l]);
            alpha[(unsigned char)S[l]]++;
            l--;
            printed = 1;
        }

        // Print right character
        if (r < n) {
            if (alpha[(unsigned char)S[r]] == 1) break;
            printf("%c", S[r]);
            alpha[(unsigned char)S[r]]++;
            r++;
            printed = 1;
        }

        if (!printed) break;
    }
    return 0;
}
/*
A string S (without any spaces) whose length is odd is passed as the input. The program must start printing from the middle character, then its immediate left and right characters. Then it must print the next immediate left and right characters and so on till one of the characters is repeated.

Boundary Condition(s): 1 <= Length of S <= 101

Input Format:

The first line contains S.

Output Format:

The first line contains a string value.

Example Input/Output 1:

Input:

character

Output :

arca

Explanation:

The middle character is a. Then r, c are printed.

Then a, t are to be printed. But when a is printed it has been repeated already. So we stop.

Example Input/Output 2:

Input:

mango

Output 

nagmo
*/
