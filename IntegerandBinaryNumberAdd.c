#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int findSeriesSum(char *str) {
    int result = 0;
    char *token = strtok(str, " ");

    while (token != NULL) {
        int len = strlen(token);
        int isBinary = 1;
        int total = 0;

        // Check if the token is a valid binary number
        for (int i = 0; i < len; i++) {
            if (token[i] != '0' && token[i] != '1') {
                isBinary = 0;
                break;
            }
        }

        if (isBinary) {
            // Convert binary to decimal
            for (int i = 0; i < len; i++) {
                total += (token[i] - '0') * pow(2, len - i - 1);
            }
        } else {
            // Convert decimal string to integer
            total = atoi(token);
        }

        result += total;
        token = strtok(NULL, " ");
    }

    return result;
}
/*
The function/method findSeriesSum accepts an argument str representing a string value. The string str contains a series of integers but some integers are denoted by their binary representations.

The function/method findSeriesSum must find the decimal value for each binary representation in the given string. Then the function must return an integer representing the sum of all the integers present in the given series.

Your task is to implement the function findSeriesSum so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1<= Each integer value in the series <= 10^7

Example Input/Output 1: Input 45 32 1010 5 10111 60

Output: 175

Explanation:

In the given series, two integers are denoted by their binary representations. 1010 -> 10 10111->23 Sum45+32+10+5+23+60-175.

Input

Example Input/Output 2:

10 111 1005 1114 101

Output: 2133

*/
