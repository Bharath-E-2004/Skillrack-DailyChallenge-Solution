#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char S[10005];
    fgets(S, 10005, stdin);

    int count = 0;
    char prev = '\0';

    for (int i = 0; S[i] != '\0'; i++) {
        if (isalpha(S[i])) {
            if (prev != '\0') {
                if ((islower(prev) && isupper(S[i])) ||
                    (isupper(prev) && islower(S[i]))) {
                    count++;
                }
            }
            prev = S[i];
        }
    }

    printf("%d", count);
    return 0;
}
/*
The program must accept a string S as the input. The program must print the number of times the alphabet toggles from lower case to upper case and vice versa.

Boundary Condition(s): 1 <= Length of S <= 10^4

Input Format: The first line contains S.

Output Format:

The first line contains an integer value representing the number of times the alphabet toggles

from lower case to upper case and vice versa in the given string S.

Example Input/Output 1:

Input:

oRange is Good.

Output: 4

Explanation:

Here the given string is orange is Good.

Initially, the toggle count is Q.

The alphabet toggles from lower case 'o' to upper case 'R', so the toggle count becomes 1.

The alphabet toggles from upper case 'R' to lower case 'a', so the toggle count becomes 2.

The alphabet toggles from lower case 'g' to upper case E, so the toggle count becomes 3.

The alphabet toggles from upper case 'G' to lower case 'o', so the toggle count becomes 4.

So 4 is printed as the output.

Example Input/Output 2:

Input:

aaa bbb cccDDD

Output:

1
*/
