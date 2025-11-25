#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* concatOrAdd(char *str1, char *str2)
{
    char *result = (char*)malloc(1000);

    int isNum1 = 1, isNum2 = 1;
    int isFloat1 = 0, isFloat2 = 0;

    // Check characters in str1
    for(int i = 0; str1[i] != '\0'; i++) {
        if(str1[i] == '.') isFloat1 = 1;
        else if(!isdigit(str1[i])) { isNum1 = 0; break; }
    }

    // Check characters in str2
    for(int i = 0; str2[i] != '\0'; i++) {
        if(str2[i] == '.') isFloat2 = 1;
        else if(!isdigit(str2[i])) { isNum2 = 0; break; }
    }

    // Case 1: both floating
    if(isFloat1 && isFloat2 && isNum1 && isNum2) {
        float f1 = atof(str1);
        float f2 = atof(str2);
        float sum = f1 + f2;

        sprintf(result, "%.2f", sum);
    }
    // Case 2: both integer
    else if(isNum1 && isNum2 && !isFloat1 && !isFloat2) {
        int n1 = atoi(str1);
        int n2 = atoi(str2);
        int sum = n1 + n2;

        sprintf(result, "%d", sum);
    }
    // Case 3: otherwise concatenate
    else {
        sprintf(result, "%s%s", str1, str2);
    }

    return result;
}

/*
The function/method concatorAdd accepts two arguments str1 and str2 representing two string values. The values of both str1 and str2 can be integers or floating point values or words.

The function/method concatorAdd must return a string based on the following conditions.

- If both str1 and str2 are integers, then the function return their sum as a string.

- If both str1 and str2 are floating point values, then the function return their sum with the precision up to 2 decimal places as a string.

- Otherwise, the function must concatenate both the words and return the concatenated string.

Your task is to implement the function concatOrAdd so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

300 450

Output: 750

Explanation:

Both the values are integer values.

So their sum is printed.

Example Input/Output 2:

Input:

15.52 123.676

Output: 139.20

Explanation:

Both the values are floating point values.

So their sum is printed with the precision up to 2 decimal places.

Example Input/Output 3:

Input Skill Rack

Output

SkillRack

Explanation:

Both the values are string values(words).

So they are concatenated and printed as the output.
*/
