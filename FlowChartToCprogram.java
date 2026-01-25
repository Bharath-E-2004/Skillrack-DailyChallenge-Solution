#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, y, d, temp;

    scanf("%d %d %d", &x, &y, &d);

    while (x <= y)
    {
        temp = x;

        while (temp > 0)
        {
            if (temp % 10 == d)
            {
                printf("%d ", x);
                break;
            }
            temp /= 10;
        }
        x++;
    }

    return 0;
}
