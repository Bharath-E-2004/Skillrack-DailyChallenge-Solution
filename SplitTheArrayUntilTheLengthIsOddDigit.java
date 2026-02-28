import java.util.*;

public class Hello {

    public static List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        split(String.valueOf(N));

        Collections.sort(list);

        for (Long num : list) {
            System.out.print(num + " ");
        }
    }

    public static void split(String val) {

        // If odd length → stop
        if (val.length() % 2 != 0) {
            list.add(Long.parseLong(val));
            return;
        }

        int len = val.length();

        String firstHalf = val.substring(0, len / 2);
        String secondHalf = val.substring(len / 2);

        // Convert to long to remove leading zeros
        long v1 = Long.parseLong(firstHalf);
        long v2 = Long.parseLong(secondHalf);

        split(String.valueOf(v1));
        split(String.valueOf(v2));
    }
}
/*
The program must accept an integer N as the input. The program must split the integer into two equal halves if the number of digits in the integer is even. Then the program must repeat the process on the resulting integers till there is no integer with an even number of digits. The leading zeroes must not be considered after each split operation. Finally, the program must print the resulting integers in sorted order.

Boundary Condition(s): 1 <= N <= 10^18

Input Format: The first line contains N.

Output Format:

The first line contains the integer values based on the given conditions.

Example Input/Output 1:

Input:

1024

Output  0 1 2 4

Explanation:

N = 1024.

1st split: 10, 24

2nd split 1, 0, 2, 4

So the resulting four integers are printed in sorted order.

Example Input/Output 2:

Input: 50000006

Output 0 0 5 6

Explanation:

N = 50000006.

1st split: 5000, 6

2nd split: 50, 0, 6

3rd split: 5, 0, 0, 6

So the resulting four integers are printed in sorted order.

Example Input/Output 3:

Input:

923456

Output: 456 923
*/
