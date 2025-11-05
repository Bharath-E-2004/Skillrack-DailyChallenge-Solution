#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, d1, d2;
    scanf("%d %d %d", &N, &d1, &d2);

    int temp = N;
    int isValid = 1;  // flag to track if all digits are within the range

    while (temp > 0) {
        int digit = temp % 10;
        if (digit < d1 || digit > d2) {
            isValid = 0;
            break;
        }
        temp /= 10;
    }

    if (isValid)
        printf("YES\n");
    else
        printf("NO\n");

    return 0;
}


