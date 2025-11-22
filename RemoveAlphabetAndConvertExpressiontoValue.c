#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int removeAlphabetsEvaluateExp(char *expression)
{
    int len = strlen(expression);

    // Allocate space for expression without alphabets
    char *clean = (char *)malloc(len + 1);
    int j = 0;

    // Remove all alphabets
    for (int i = 0; i < len; i++) {
        if (isdigit(expression[i]) || expression[i] == '+' ||
            expression[i] == '-' || expression[i] == '*' ||
            expression[i] == '/') 
        {
            clean[j++] = expression[i];
        }
    }
    clean[j] = '\0';

    int i = 0;
    int total = 0;
    int first = 1;
    char op = '+';

    // Left-to-Right evaluation
    while (i < j)
    {
        // Read a number
        int num = 0;
        while (i < j && isdigit(clean[i])) {
            num = num * 10 + (clean[i] - '0');
            i++;
        }

        if (first) {
            total = num;
            first = 0;
        } 
        else {
            if (op == '+') total = total + num;
            else if (op == '-') total = total - num;
            else if (op == '*') total = total * num;
            else if (op == '/') total = total / num;
        }

        // Read next operator if exists
        if (i < j) {
            op = clean[i];
            i++;
        }
    }

    free(clean);
    return total;
}

/*
The function/method removeAlphabets EvaluateExp accepts an argument str. The string str represents an arithmetic expression but some alphabets are inserted in the expression.

The function/method removeAlphabets EvaluateExp must remove those alphabets and evaluate the expression. Then the function must return an integer representing the result of the expression.

Note:

- The operators in the expression are addition (+), subtraction (-), multiplication (*) and division

S - Evaluation must be done from left to right direction.

Your task is to implement the function removeAlphabets EvaluateExp so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

ab4cd+e2f0g-hi5hello how3are-1you

Output:

56

Explanation:

After removing the alphabets in the given string, the string becomes "4+20-5*3-1".

4+20-5*3-124-5*3-1 24-5*3-1-19*3-1 19*3-1->57-1 57-1 => 56

Example Input/Output 2:

Input:

100cowcat25lions+4*5tiger-255

Output: 
-215
*/
