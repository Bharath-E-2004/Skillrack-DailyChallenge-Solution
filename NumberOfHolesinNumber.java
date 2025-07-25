import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Number of holes for digits 0-9
        int[] digit = {1, 0, 0, 0, 1, 0, 1, 0, 2, 1};

        for (int i = 4; i <= size; i++) {
            int count = countHoles(digit, i);

            // Check if hole count is at least equal to number of digits
            if (count >= (int) Math.log10(i) + 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countHoles(int[] digit, int val) {
        if (val < 10) {
            return digit[val];
        }
        return digit[val % 10] + countHoles(digit, val / 10);
    }
}
/*
The program must accept an integer N (where N <= 9999) as the input. The program must print the integers from 1 to N based on the following conditions.

The total number of holes in each single-digit integer must be greater than or equal to 1.

The total number of holes in each two-digit integer must be greater than or equal to 2.

The total number of holes in each three-digit integer must be greater than or equal to 3.

-The total number of holes in each four-digit integer must be greater than or equal to 4.

The number of holes in each digit from 0 to 9 is given below.

0-1

1-0

2-0

3-0

4-1

5-0

6-1

7-0

8-2

9-1

Boundary Condition(s):

4<=N<=9999

Input Format:

The first line contains N.

Output Format:

The first line contains the integer values separated by a space based on the given conditions.

Example Input/Output 1:

Input

50

Output:

4 6 8 9 18 28 38 40 44 46 48 49
*/
