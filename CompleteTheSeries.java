import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long finalAns = 0, s1 = 0, s2 = 1;

        if (n <= 2) {
            System.out.println(n == 1 ? 0 : 1);
            return;
        }

        for (int i = 2; i < n; i++) {
            finalAns = 1 + s2 + 2 * s1 + 3;
            s1 = s2;
            s2 = finalAns;
            System.out.println(finalAns);
        }

        sc.close();
    }
}
/*
The program must accept an integer N as the input. The program must print the Nth term in the following series. 0, 1, 4, 9, 20, 41, 84, 169, 340, ... and so on.

In the above series, S[1] = 0 S[2] = 1 S[K] = 1*S[K-1]+ 2*S[K-2] + 3, for K > 2.

Boundary Condition(s): 1<= N <=50

Input Format: The first line contains N.

Output Format: The first line contains the Nth term in the above-mentioned series.

Example Input/Output 1:

Input: 4

Output 9

Explanation: Here N=4.

So the fourth term in the above-mentioned series is 9, which is printed as the output.

Example Input/Output 2:

Input: 11

Output: 1364
*/
