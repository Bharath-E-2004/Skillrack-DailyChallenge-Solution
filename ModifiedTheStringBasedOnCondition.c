#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *str = NULL;
    size_t size = 0;

    getline(&str, &size, stdin);

    int len = strlen(str);

    // Remove newline if present
    if (str[len - 1] == '\n') {
        str[len - 1] = '\0';
        len--;
    }

    int i = 0;

    while (i < len) {
        char start = str[i];
        char next = start;

        int j = i;

        // Count repeated characters
        while (j < len && str[j] == start) {
            if (next > 'z')
                next = 'a';
            printf("%c", next);
            next++;
            j++;
        }

        i = j;
    }

    return 0;
}

/*
The program must accept a string S containing only lower case alphabets as the input. The program must replace each sequence of repeated alphabets in S with the sequence of English alphabets starting from the repeated alphabet. Consider the English alphabets in circular fashion when replacing the repeated alphabets in S. Finally the program must print the revised string S as the output.

Boundary Condition(s): 1 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The first line contains the revised string S.

Example Input/Output 1:

Input:

breezzzeeee

Output: brefzabefgh

Explanation:

Here the given string is breezzzeeee.

The first sequence of repeated alphabets is ee, which is replaced with ef.

The second sequence of repeated alphabets is zzz, which is replaced with zab.

The third sequence of repeated alphabets is eeee, which is replaced with efgh.

So the string becomes brefzabefgh.

Example Input/Output 2:

Input:

bookkeeper

Output:

bopklefper
*/
