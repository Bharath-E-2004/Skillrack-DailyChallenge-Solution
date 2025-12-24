#include <stdio.h>

int isPrime(int n) {
    if (n < 2) return 0;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return 0;
    }
    return 1;
}

int main() {
    int N;
    scanf("%d", &N);

    int digitCount[10] = {0};
    for (int i = 0; i < N; i++) {
        int d;
        scanf("%d", &d);
        digitCount[d] = 1;
    }

    for (int num = 2; num < 1000; num++) {
        if (!isPrime(num))
            continue;

        int temp = num;
        int used[10] = {0};
        int valid = 1;

        while (temp > 0) {
            int digit = temp % 10;

            if (!digitCount[digit] || used[digit]) {
                valid = 0;
                break;
            }
            used[digit] = 1;
            temp /= 10;
        }

        if (valid)
            printf("%d ", num);
    }

    return 0;
}
/*
The program must accept N distinct digits as the input. The program must print all possible prime numbers (1, 2 or 3 digits) that can be formed with these N digits. The prime numbers must be sorted.

Boundary Condition(s): 2 <= N <= 10

Input Format:

The first line contains N.

The second line contains N digits separated by a space.

Output Format: The first line contains all possible prime numbers that can be formed with the given N digits.

Example Input/Output 1:

Input:

4 3017

Output:

37 13 17 31 37 71 73 103 107 137 173 307 317 701

Explanation:

Here N-4 and the given 4 digits are 3, 0, 1 and 7.

All the possible prime numbers(containing unique digits) that can be formed with the digits 3, 0, 1 and 7 are given below 37 13 17 31 37 71 73 103 107 137 173 307 317 701

Example Input/Output 2:

Input: 5

10258

Output: 25 251 281 521 821
*/
