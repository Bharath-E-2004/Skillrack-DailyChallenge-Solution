import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long[] result = new long[size];

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            result[i] = modify(val);
        }

        Arrays.sort(result);

        for (long val : result) {
            System.out.print(val + " ");
        }

        sc.close();
        System.exit(0);
    }

    public static long modify(int val) {
        int maxDigit = 0;
        int ind = -1;
        String str = String.valueOf(val);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit > maxDigit) {
                maxDigit = digit;
                ind = i;
            }
        }

        // Replace the part after maxDigit with (maxDigit-1) repetitions of the digit
        String modified = str.substring(0, ind) 
                        + String.valueOf(maxDigit).repeat(Math.max(0, maxDigit - 1)) 
                        + str.substring(ind);

        return Long.parseLong(modified);
    }
}

/*
The program must accept N integers as the input. The program must expand each integer to a maximum value by repeating any one of the digits D in the integer D times. Finally, the program must sort those revised integers and print them as the output.

Boundary Condition(s):

1<= N <= 100

1<= Each integer value < 10^8

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains N Integers separated by a space representing the sorted integers.

Example Input/Output 1:

Input:

4 512 123 782 90

Output:

12333 5555512 7888888882 9999999990

Explanation:

512-> 5555512 or 512 or 5122->5555512 is the maximum value.

123-> 123 or 1223 or 12333 -> 12333 is the maximum value.

782-> 777777782 or 7888888882 or 7822 -> 7888888882 is the maximum value.

90->9999999990 or 9-> 9999999990 is the maximum value.

So the expanded values are sorted and printed as the output.

Example Input/Output 2:

Input: 5 404 34 525 48185 51

Output:

34444 444404 555551 5555525 488888888185
*/
