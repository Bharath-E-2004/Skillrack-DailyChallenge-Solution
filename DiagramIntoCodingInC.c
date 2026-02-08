#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, a, b, c;
    int val = 1, ctr = 1;

    scanf("%d %d %d %d", &n, &a, &b, &c);

    while (ctr <= n)
    {
        printf("%d ", val);

        if (val == a)
        {
            val = b;
        }
        else if (val == c)
        {
            val = 0;
        }
        else
        {
            val++;
        }

        ctr++;
    }

    return 0;
}
