#include <stdio.h>
#include <stdlib.h>

int main() {
    int m, n;
    scanf("%d %d", &m, &n);

    int ctr = 1;
    while (m > 0 || n > 0) {
        if (ctr % 2) {  // odd turn → print from n first, then m
                printf("%d", m % 10);
                m /= 10;
        
        } else {  // even turn → print from m first, then n
           
                printf("%d", n % 10);
                n /= 10;
        }
        ctr++;
    }

    return 0;
}
