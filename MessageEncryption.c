#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* encryptMessage(char *message, char *key) {

    // 1. Create a 26-char encryption key
    char *newkey = (char*) malloc(27);
    int used[26] = {0};
    int idx = 0;

    // Add characters already in key
    for (int i = 0; key[i] != '\0'; i++) {
        if (!used[key[i] - 'a']) {
            newkey[idx++] = key[i];
            used[key[i] - 'a'] = 1;
        }
    }

    // Add missing alphabets
    for (char c = 'a'; c <= 'z'; c++) {
        if (!used[c - 'a']) {
            newkey[idx++] = c;
        }
    }
    newkey[26] = '\0';

    // 2. Encrypt message
    int len = strlen(message);
    char *result = (char*) malloc(len + 1);

    for (int i = 0; i < len; i++) {
        int originalIndex = message[i] - 'a';   // 0–25
        result[i] = newkey[originalIndex];
    }
    result[len] = '\0';

    return result;
}

/*
[09-12-2025 18:37] Bharath. E: The function/method encryptMessage accepts two arguments message and key representing two string values. The string message contains only lower case alphabets. The string key contains only unique lower case alphabets.

The function/method encryptMessage must form a new string by encrypting the given message based on the following conditions.

- All 26 lower case alphabets from a to z must be mapped with the alphabets in the string key.

- If the number of alphabets in the key is less than 26, then the missing lower case alphabets must be added to key in alphabetical order.

- For each alphabet CH in the message, the function must find the alphabet from the key which is mapped to CH and form the encrypted string.

Finally, the function must return the encrypted string.

Your task is to implement the function encryptMessage so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

skillrack

master

Output:

pgdhhomsg

Explanation:

Message "skillrack"

Key="master"

Here the number of alphabets in the key is less than 26. So the missing lower case alphabets

are added in alphabetical order.

abcdefghijklmnopqrstuvwxyz (26 lower case alphabets)

masterbcdfghijkdnopquvwxyz (encryption key)

So "skillrack" is encrypted as "pgdhhomsg".

Example Input/Output 2:

Input:

computerscience

abcghimnostuy
[09-12-2025 18:37] Bharath. E: Output:

ceyfqphklcohdch
*/
