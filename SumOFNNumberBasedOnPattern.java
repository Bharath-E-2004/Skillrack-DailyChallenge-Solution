import java.util.*;

public class Hello {

    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        int i = 1;
        long total = 0;

        while (num - i >= 0) {
            total += ((long)i * (i + 1) / 2);
            num -= i;
            i++;
        }

        if (num > 0) {
            total += ((long)num * (num + 1) / 2);
        }

        System.out.println(total);
    }
}

/*
The program must accept an integer N as the input. The program must print the sum of the first N terms in the following series. 1121231234123451234561234567... and so on.

The above series contains the integers 1, 1 to 2, 1 to 3, 1 to 4, 1 to 5, 1 to 6, ... and so on.

Boundary Condition(s): 1<= N <= 10^6

Input Format:

The first line contains N.

Output Format:

The first line contains an integer representing the sum of the first N terms in the above-mentioned series.

Input:

ESC

Example Input/Output 1: 7

Output: 11

Explanation:

The first 7 terms are 112123 1. So their sum is 11 (1+1+2+1+2+3+1).

Example Input/Output 2: 10

Input:

Output: 20
*/
