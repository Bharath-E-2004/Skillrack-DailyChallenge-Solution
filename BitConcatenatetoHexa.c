#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void concatAndConvertToHex(int SIZE, int arr[]) {
    // A buffer to hold the concatenated binary representation.
    // Max size is 100 integers, each up to ~20 bits, so 2000 characters is a good estimate.
    // Let's use 3201 to be safe (100 * 32 + 1 for null terminator).
    char concatenatedBinary[3201];
    char* currentPos = concatenatedBinary;
    *currentPos = '\0'; // Initialize as an empty string.

    // Step 1: Convert each integer to binary and concatenate.
    for (int i = 0; i < SIZE; i++) {
        int num = arr[i];

        // Handle the edge case where the number is 0.
        if (num == 0) {
            *currentPos++ = '0';
            continue;
        }

        // Find the position of the most significant bit.
        int highestBit = -1;
        for (int j = 31; j >= 0; j--) {
            if ((num >> j) & 1) {
                highestBit = j;
                break;
            }
        }

        // Append the binary representation without leading zeros.
        for (int j = highestBit; j >= 0; j--) {
            *currentPos++ = ((num >> j) & 1) ? '1' : '0';
        }
    }
    *currentPos = '\0'; // Null-terminate the final concatenated string.

    // Step 2: Pad the concatenated binary string with leading zeros if its length
    // is not a multiple of 4.
    int len = strlen(concatenatedBinary);
    int padLength = (4 - (len % 4)) % 4;

    // A temporary buffer to hold the padded binary string.
    char finalBinary[3201 + 4];
    memset(finalBinary, '0', padLength);
    strcpy(finalBinary + padLength, concatenatedBinary);

    // Step 3: Iterate through the padded string in 4-bit chunks and print the hexadecimal equivalent.
    for (int i = 0; i < strlen(finalBinary); i += 4) {
        int val = 0;
        // Convert the 4-bit binary chunk to an integer.
        for (int j = 0; j < 4; j++) {
            val = val * 2 + (finalBinary[i + j] - '0');
        }
        
        // Print the corresponding hexadecimal character.
        if (val < 10) {
            printf("%d", val);
        } else {
            printf("%c", 'A' + val - 10);
        }
    }
    printf("\n");
}
