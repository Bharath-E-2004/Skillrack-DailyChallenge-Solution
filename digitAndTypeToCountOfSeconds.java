import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        int seconds = 0;

        for (int i = 1; i < str.length(); i++) {
            int prev = str.charAt(i - 1) - '0';
            int curr = str.charAt(i) - '0';
            seconds += getSeconds(prev, curr);
        }

        System.out.println(seconds);
    }

    // Function to calculate time between two digits
    public static int getSeconds(int val1, int val2) {
        if (val1 == val2) return 0; // same key → 0 sec

        // get row and col of both digits in 3x3 grid
        int r1 = (val1 - 1) / 3;
        int c1 = (val1 - 1) % 3;
        int r2 = (val2 - 1) / 3;
        int c2 = (val2 - 1) % 3;

        // if adjacent (Chebyshev distance ≤ 1) → 1 sec
        if (Math.abs(r1 - r2) <= 1 && Math.abs(c1 - c2) <= 1) {
            return 1;
        }

        // otherwise → 2 sec
        return 2;
    }
}
/*
There are 9 keys in a mobile. The 9 keys are arranged as a 3º3 matrix as shown below.

123

456

789

The program must accept a string S containing only nonzero digits indicating the digits to be typed on the mobile. To type the first digit in S, it takes 0 seconds. To type the next digit, it takes 1 second if the next digit is an adjacent digit(in all 8 possible directions). If the next digit is equal to the current digit, it takes 0 seconds. Otherwise, it takes 2 seconds. The program must print the number of seconds it takes to type the string S as the output.

Boundary Condition(s): 1 <= Length of S <= 100

Input Format: The first line contains S.

Output Format:

The first line contains an integer value representing the number of seconds it takes to type the string S.

Example Input/Output 1:

Input: 146591

Output: 7
*/
