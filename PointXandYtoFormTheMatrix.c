#include <stdio.h>
#include <stdlib.h>

int main() {
    int size;
    scanf("%d", &size);

    for (int i = 0; i < size; i++) {
        int x, y;
        scanf("%d %d", &x, &y);

        int ind = 1;

        printf("[[");
        for (int r = 1; r <= x; r++) {
            for (int c = 1; c <= y; c++) {
                printf("%d", ind);
                ind++;

                if (c < y) printf(" ");  // space between numbers
            }
            if (r < x)
                printf("] [");  // new row
        }
        printf("]]\n");
    }

    return 0;
}
