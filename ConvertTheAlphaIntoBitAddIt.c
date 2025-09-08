#include <iostream>
#include <cstring>
#include <cmath>

long long int stringToDecimal(const char* str) {
    long long int result = 0;
    int length = strlen(str);
    int power = 0;

    // Traverse the string from right to left
    for (int i = length - 1; i >= 0; i--) {
        if (str[i] == '1') {
            result += static_cast<long long>(pow(2, power));
        }
        power++;
    }

    return result;
}
/*
The function/method string To Decimal accepts an argument str representing a string value.

The string str contains only alphabets.

The function/method string To Decimal must return an integer X whose binary representation is formed by replacing each odd ASCII alphabet with 1 and each even ASCII alphabet with 0 in the given string.

Your task is to implement the function string ToDecimal so that the program runs successfully.

IMPORTANT; Do not write the main() function as it is already defined.

Boundary Condition(s):

1 <= Length of the string str <= 50

Example Input/Output 1:

Input

Moon

Output: 14

Explanation:

The ASCII value of M is 77.

A

The ASCII value of o is 111.

The ASCII value of n is 110.

So Moon -> 1110 -> 14.

Example Input/Output 2:

Input:

Southindia

Output

915
*/
