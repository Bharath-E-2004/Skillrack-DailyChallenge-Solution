#include <stdio.h>

#include <stdlib.h>

int main()

{

int N;

scanf("%d", &N);

printf("%d", ( N>>2 ) & 1);

return 0;

}

/*
   Third Bit from Last

The program must accept an integer N as the input. The program must print the third bit from the last of the binary representation of N. Please fill in the blanks with code so that the program runs successfully.

Boundary Condition(s): 4 <= N <= 10^5

Input Format:

The first line contains N.

Output Format:

The first line contains the third bit from the last of the binary representation of N.

Example Input/Output 1:

Input:

10

Output:

0

Explanation:

The binary representation of 10 is 1010. The 3rd bit from the last is 0, which is printed as the output.

Example Input/Output 2:

Input: 12

Output: 1

Explanation:

The binary representation of 12 is 1100. The 3rd bit from the last is 1, which is printed as the output.
*/
