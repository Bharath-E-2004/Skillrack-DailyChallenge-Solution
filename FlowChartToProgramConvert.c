#include <stdio.h>
#include <stdlib.h>

int main() {
    int num1, num2, temp;

    scanf("%d %d", &num1, &num2);

    while (num1 > 0 && num2 > 0) {

        printf("%d %d\n", num1, num2);

        // decrement both
        num1--;
        num2--;

        // if num2 is divisible by 100, swap
        if (num2 % 10 == 0) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
    }

    return 0;
}
