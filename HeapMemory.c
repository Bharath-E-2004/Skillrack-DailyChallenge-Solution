#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;

    printf("Enter size: ");
    scanf("%d", &n);

    int *arr = (int*) malloc(n * sizeof(int));  // heap allocation

    if (arr == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    // Store values
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Print values
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    // Free memory
    free(arr);

    return 0;
}
