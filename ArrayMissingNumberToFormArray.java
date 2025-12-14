import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] len = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            len[i] = (arr[i] == 0) ? 1 : (int) Math.log10(arr[i]) + 1;
        }

        // Find expected digit length
        int expectedLen = 0;
        for (int i = 0; i < N; i++) {
            expectedLen = Math.max(expectedLen, len[i]);
        }

        int shortIdx = -1, longIdx = -1;

        for (int i = 0; i < N; i++) {
            if (len[i] < expectedLen) shortIdx = i;
            if (len[i] > expectedLen) longIdx = i;
        }

        // Fix only if mismatch exists
        if (shortIdx != -1 && longIdx != -1) {
            int diff = len[longIdx] - expectedLen;

            int power = (int) Math.pow(10, diff);

            int extraDigits = arr[longIdx] % power;
            arr[longIdx] /= power;
            arr[shortIdx] = arr[shortIdx] * power + extraDigits;
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println(sum);
    }
}

/*
The program must accept an array of N integers of an equal number of digits, but some digits at the end of an integer are missing and those missing digits are appended to some other integer in the array. The program must find those two integers and make the integers with an equal number of digits. Then the program must print the N integers and their sum as the output.

Boundary Condition(s):

2<= N <= 1000

1<= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains the N revised integers separated by a space. The second line contains the sum of the N revised integers.

Example Input/Output 1:

Input:

5

645 12 814 2476 459

Output:

645 126 814 247 459

2291

Explanation:

Here N-5.

2nd Integer 12 One digit is missing.

4th integer: 2476- One digit is appended. So 12 becomes 120 and 2476 becomes 247.

645126814247459-2291.
*/
