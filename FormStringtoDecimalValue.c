#include <stdio.h>
#include <stdlib.h>
#include <string.h>

long long int formIntegerFromDigits(char *str) {
    long long int result = 0;
    int negative = 0;

    char *token = strtok(str, ".");
    while (token != NULL) {
        printf("%s\n", token);
        if (strlen(token) == 2) {
            result = result * 10 + (token[1] - '0');
            negative++;
        } else {
            result = result * 10 + (token[0] - '0');
        }
        token = strtok(NULL, ",");
    }

    if (negative % 2) result *= -1;
    return result;
}

int main() {
    char str[101];
    scanf("%s", str);
    printf("%lld\n", formIntegerFromDigits(str));
    return 0;
}
/*
Note: The resulting integer value ranges from -2^63 to (2^63)-1.

Your task is to implement the function formIntegerFromDigits so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input: 1,2,5,9

Output 1259

Explanation:

Here the given string is 1,2,5,9.

After concatenating the given digits, the integer becomes 1259.

Example Input/Output 2:

Input 0,0,5,6,7

Output

567

Example Input/Output 3:

Input 5,0,-2,1

Output

-5021

Example Input/Output 4:

Input:

9,1,-5,6,5,-4,7,2,5,-1,0,-8

Output:

915654725108
*/
