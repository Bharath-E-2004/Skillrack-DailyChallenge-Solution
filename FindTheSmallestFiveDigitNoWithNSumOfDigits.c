#include <stdio.h>

int sum(int n) {
    int total = 0;
    while (n > 0) {
        total += (n % 10);
        n /= 10;
    }
    return total;
}

int main() {
    int S;
    scanf("%d", &S);

    // Maximum sum of digits for 5-digit number is 45
    if (S > 45) {
        printf("-1");
        return 0;
    }

    // Check from smallest 5-digit number
    for (int i = 10000; i <= 99999; i++) {
        if (sum(i) == S) {
            printf("%d", i);
            return 0;   // smallest found, exit immediately
        }
    }

    // If no number found
    printf("-1");
    return 0;
}

/*
The program must accept an integer S as the input. The program must print the smallest 5-digit integer whose sum of digits is equal to S. If it is not possible to form such an integer, then the program must print -1 as the output.

Boundary Condition(s): 1<=S<=50

Input Format: The first line contains S.

Output Format: The first line contains the smallest 5-digit integer whose sum of digits is equal to S.

Example Input/Output 1:

Input: 10

Output 10009

Explanation:

Here S = 10. The smallest possible 5-digit integer that can be formed is 10009 (1+0+0+0+ 9 = 10)

Example Input/Output 2: Input 46

Output -1

Example Input/Output 3: Input

25

Output: 10699
*/
