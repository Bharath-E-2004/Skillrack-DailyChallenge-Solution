#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, x, y;
    scanf("%d %d", &x, &y);

    do {
        scanf("%d", &n);

        if (n % 2 == 0) {
            n += x;
            y--;
        }

        n += y;
        x--;

        printf("%d ", n);

    } while (n > 0);

    exit(0);
}
