import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vall = sc.nextInt();
        int val = 1;

        for (int i = 0; i < vall; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(val + " ");
                val += 2;
            }
            System.out.println(val);
            val++;
        }

        sc.close();
        System.exit(0);
    }
}
/*
The program must accept an integer N as the input. The program must print the integer values in N lines based on the following conditions.

- If the row number X is odd, then the Xth row contains X consecutive odd integers sorted in ascending order.

- If the row number X is even, then the Xth row contains X consecutive even integers sorted in ascending order.

-The last integer in each row must be equal to the square of the row number X

Boundary Condition(s):

1<= N <= 100

Input Format:

The first line contains N.

Output Format:

The first N lines contain the integer values based on the given conditions.

Example Input/Output 1:

Input:

5

Output

1

2 4

5 7 9

10 12 14 16

17 19 21 23 25

Explanation:

X 1:1 (only 1 odd integer)

X2: 24 (2 consecutive even integers ending with 2*2)

X=3:57 9 (3 consecutive odd integers ending with 3*3)

X-4: 10 12 14 16 (4 consecutive even integers ending with 4*4) X-5:17 19 21 23 25 (5 consecutive odd integers ending with 5*5)
*/
