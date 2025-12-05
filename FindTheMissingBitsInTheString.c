#include <stdio.h>
#include <string.h>

int findMissingBit(char str[], int x) {
    char bit[33];
    int ind = 0;

    // Convert x to binary (string)
    while (x > 0) {
        bit[ind++] = (x % 2) + '0';
        x /= 2;
    }
    bit[ind] = '\0';

    // Reverse to normal binary order
    for (int i = 0; i < ind / 2; i++) {
        char temp = bit[i];
        bit[i] = bit[ind - 1 - i];
        bit[ind - 1 - i] = temp;
    }

    int len1 = strlen(str);
    int len2 = strlen(bit);

    int i = len1 - 1, j = len2 - 1;

    // Compare bits from right (LSB)
    while (i >= 0 && j >= 0) {
        if (str[i] != bit[j])
            return 0;   // First mismatch
        i--;
        j--;
    }

    return 1; // No mismatch
}

int main() {
    char str[50];
    int x;

    scanf("%s", str);
    scanf("%d", &x);

    printf("%d", findMissingBit(str, x));
    return 0;
}
/*
The function/method find MissingBit accepts two arguments str and X. The string str represents the binary representation of the integer X but exactly one bit is missing.

The function/method find Missing Bit must find the missing bit in the string S and return the missing bit as an integer value.

Your task is to implement the function find MissingBit so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

10111

45

Output

0

Explanation:

The string S = "10111".--

The binary representation of 45 is 101101

The missing bit in the string Sis which is printed as the output

Example Input/Output 2.

Input:

111 15

Output 1
*/
