#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Time {
    int days;
    int hours;
    int minutes;
    int seconds;
};

struct Time* calculateTotalTime(char *str) {
    struct Time *result = (struct Time*)malloc(sizeof(struct Time));
    long long int totalSeconds = 0;

    char *token = strtok(str, " ");
    while (token != NULL) {
        int num = 0;
        int len = strlen(token);

        // Extract numeric part
        for (int i = 0; i < len - 1; i++) {
            if (token[i] >= '0' && token[i] <= '9') {
                num = num * 10 + (token[i] - '0');
            }
        }

        // Identify time unit and add corresponding seconds
        if (token[len - 1] == 'd')
            totalSeconds += num * 86400;      // 1 day = 86400 seconds
        else if (token[len - 1] == 'h')
            totalSeconds += num * 3600;       // 1 hour = 3600 seconds
        else if (token[len - 1] == 'm')
            totalSeconds += num * 60;         // 1 minute = 60 seconds
        else if (token[len - 1] == 's')
            totalSeconds += num;              // seconds

        token = strtok(NULL, " ");
    }

    // Convert total seconds back to days, hours, minutes, seconds
    result->days = totalSeconds / 86400;
    totalSeconds %= 86400;
    result->hours = totalSeconds / 3600;
    totalSeconds %= 3600;
    result->minutes = totalSeconds / 60;
    totalSeconds %= 60;
    result->seconds = totalSeconds;

    return result;
}

// Example usage
int main() {
    char input[] = "1d 2h 30m 45s";
    struct Time *t = calculateTotalTime(input);

    printf("Days: %d, Hours: %d, Minutes: %d, Seconds: %d\n", 
           t->days, t->hours, t->minutes, t->seconds);

    free(t);
    return 0;
}

/*
The function/method calculate Total Time accepts an argument str. The string str contains multiple integers separated by a space, where each integer ends with a character denoting the

unit of time.

d indicates days.

h indicates hours.

m indicates minutes.

a indicates seconds.

The function/method calculate TotalTime must return the total time in days, hours, minutes and seconds.

Your task is to implement the function calculate TotalTime so that the program runs successfully.

The following structure is used to represent the Time and is already defined in the default code (Do not write this definition again in your code).

struct Time

{

};

int days;

int hours;

int minutes;

int seconds;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

2h 1d 50m 102s 5d 30s 70m

Output:

642 12

Explanation:

2h-> 2 hours

1d-> 1 day

50m -> 50 minutes

102s-> 102 seconds

Sd-> 5 days

30s-> 30 seconds

70m -> 70 minutes

Example Input/Output 2:

Input:

15d 500s 30h 60s

Output: 16 6 9 20
*/
