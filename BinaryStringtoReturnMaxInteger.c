#include <stdio.h>
#include <string.h>
#include <math.h>

int findLargestKBits(char *str, int K) {
    int max = 0;
    int len = strlen(str);

    for (int i = 0; i <= len - K; i++) {
        int total = 0;
        for (int j = 0; j < K; j++) {
            if (str[i + j] == '1') {
                total += pow(2, K - 1 - j);
            }
        }
        printf("%d ", total);
        if (total > max) {
            max = total;
        }
    }

    return max;
}
/*
The function/method find LargestKBits accepts two arguments str and K. The string str contains only Os and 1s. K represents an integer value.

The function/method find LargestKBits must an integer representing the largest possible integer that can be formed using exactly K consecutive bits in the given string.

Note: The value of K is always less than or equal to the length of the given string

Your task is to implement the function find LargestKBits so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1 <= Length of the string <= 1000

1 <= K <= 31

Example Input/Output 1:

Input:

001001101100 4

Output 13

Explanation:

Here K 4

All possible ways are given below

0010 -> 2

0100->4

100->9

0011 -> 3

0110->6

1101-13

0110-6

1100-> 12

The largest possible integer using 4 consecutive bits is 13.
*/
