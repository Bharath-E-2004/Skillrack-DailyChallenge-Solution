import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        String K = sc.next();   // Read K as String to extract digits
        long total = 0;

        for (char digit : K.toCharArray()) {
            int min = Integer.MAX_VALUE;

            for (int num : arr) {
                // Check if the number contains the digit
                if (String.valueOf(num).indexOf(digit) != -1) {
                    min = Math.min(min, num);
                }
            }

            // If no number contains the digit, add 0
            if (min != Integer.MAX_VALUE) {
                total += min;
            }
        }

        System.out.println(total);
    }
}

/*
The program must accept N integers and an integer K as the input. For each digit D in K, the program must find the smallest integer that contains the digit D. If there is no integer with the digit D, then consider 0 for that digit. Finally, the program must print the sum of resulting integers as the output.

Boundary Condition(s):

1<=N<= 100

1<= Each integer value, K <= 10^7

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains K.

Output Format:

The first line contains an integer representing the sum of resulting integers based on the given

conditions.

Example Input/Output 1:

Input:

7 909 880 283 205 790 495 922 248

Output: 983

Explanation: Here K 248.

1st digit is 2: The smallest integer having the digit 2 is 205.

2nd digit is 4: The smallest integer having the digit 4 is 495.

3rd digit is 8: The smallest integer having the digit 8 is 283.

205495283-983.

Hence 983 is printed as the output.
*/
