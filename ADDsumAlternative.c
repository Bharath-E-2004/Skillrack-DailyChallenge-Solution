#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int addSubtract(char *str) {
    int a[100101]; // Array to store numbers
    int idx = 0, i = 0;

    while (str[i]) {
        if (str[i] == '-' || isdigit(str[i])) {
            int j = i;
            long num = 0;

            if (str[j] == '-') j++; // Skip minus sign

            // Build number
            while (isdigit(str[j])) {
                num = num * 10 + (str[j] - '0');
                j++;
            }

            // Apply sign
            if (str[i] == '-') num = -num;

            a[idx++] = num;
            i = j; // Move to next character
        } else {
            i++;
        }
    }
    // Alternate addition and subtraction
    int p = 1;
    int sum = a[0];
    for (int i = 1; i < idx; i++) {
        if (p)
            sum += a[i];
        else
            sum -= a[i];
        p = !p; // Toggle between add/subtract
    }

    return sum;
}

int main() {
    char str[1001];
    scanf("%s", str);
    printf("%d\n", addSubtract(str));
    return 0;
}
/*
The function/method addSubtract accepts an argument str. The string str contains integer values, where each integer is enclosed within a pair of parentheses.

The function/method addSubtract must add and subtract the integers alternatively in the given string. Then the function must return an integer representing the result.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

(-5)(10)(3)(9)

Output: 11

Explanation:

(-5)(10)(3)(9)=-5+10-3+9 = 11

Example Input/Output 2:

Input:

(1)(2)(3)

Output: 0
*/
