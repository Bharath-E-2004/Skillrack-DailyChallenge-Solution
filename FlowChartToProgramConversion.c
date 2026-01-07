#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m, n;
    scanf("%d %d", &m, &n);

    while (m < n)
    {
        printf("%d ", m);

        if (n % 101 == 0 && n % 2 != 0)
        {
            m += n % 10;
        }
        else
        {
            m++;
        }

        n--;
    }

    return 0;
}
