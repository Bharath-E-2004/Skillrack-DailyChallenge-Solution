#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* moveLowerUpperCase(const char* str) {
    int len = strlen(str);
    char* result = (char*)malloc(len + 1); // +1 for null terminator

    if (!result) return NULL; // Check for allocation failure

    int lower = 0, upper = 0, digit = 0;

    // First pass: count types
    for (int i = 0; i < len; i++) {
        if (islower(str[i])) lower++;
        else if (isupper(str[i])) upper++;
        else if (isdigit(str[i])) digit++;
    }

    // Set starting indices
    int lowerIndex = 0;
    int upperIndex = lower;
    int digitIndex = lower + upper;

    // Second pass: fill result array
    for (int i = 0; i < len; i++) {
        if (islower(str[i])) {
            result[lowerIndex++] = str[i];
        } else if (isupper(str[i])) {
            result[upperIndex++] = str[i];
        } else if (isdigit(str[i])) {
            result[digitIndex++] = str[i];
        }
    }

    result[len] = '\0'; // Null-terminate the string
    return result;
}

int main() {
    char input[] = "aB3cD4eF";
    char* output = moveLowerUpperCase(input);
    if (output) {
        printf("Reordered string: %s\n", output);
        free(output);
    }
    return 0;
}
