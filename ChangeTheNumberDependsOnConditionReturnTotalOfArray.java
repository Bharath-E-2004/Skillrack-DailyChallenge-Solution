import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        long sum = 0;

        for (int i = 0; i < N; i++) {

            // current integer without first digit
            String body = arr[i].substring(1);

            // previous integer's last digit (unit digit)
            String prev = arr[(i - 1 + N) % N];
            char unit = prev.charAt(prev.length() - 1);

            // new number = body + unit digit
            long revised = Long.parseLong(body + unit);

            sum += revised;
        }

        System.out.println(sum);
    }
}
/*
The program must accept N integers as the input, but the first digit of each integer denotes the unit digit of the previous integer. Consider the previous integer of the 1st integer as the Nth integer. The program must rearrange the unit digits to the respective integers, and then print their sum as the output.

Boundary Condition(s):

2 <= N <= 100

10 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains an integer representing the sum of the N revised integers.

Example Input/Output 1:

Input

4

614 5273 41 278

Output 3677

Explanation:

Here N-4.

After rearranging the unit digits to the respective integers, the integers become

614 5273 41 278-> 145 2734 12 786

145273412 786-3677.

Example Input/Output 2:

Input

3

010 020 5500

Output: 5305
*/
