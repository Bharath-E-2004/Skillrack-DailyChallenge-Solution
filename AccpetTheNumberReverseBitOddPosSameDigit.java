import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        // Convert to binary strings
        String v1 = Integer.toBinaryString(val1);
        String v2 = Integer.toBinaryString(val2);

        // Pad the shorter string with leading zeros
        int maxLen = Math.max(v1.length(), v2.length());
        v1 = String.format("%" + maxLen + "s", v1).replace(' ', '0');
        v2 = String.format("%" + maxLen + "s", v2).replace(' ', '0');

        // Find matching bits
        StringBuilder same = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            if (v1.charAt(i) == v2.charAt(i)) {
                same.append(v1.charAt(i));
            }
        }

        // Output result
        if (same.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(Integer.parseInt(same.toString(), 2));
        }

        sc.close();
    }
}
/*
The program must accept two integers X and Y as the input. The program must print an integer C whose binary representation indicates the same bits at the odd positions from LSB(Least Significant Bit) of the integers X and Y. If there are no bits same at odd positions, then the program must print-1 as the output.

Boundary Condition(s): 1<=XY <= 10^8

Input Format: The first line contains X and Y separated by a space.

10-11 12 13 14

Output Format: The first line contains C.

15 16 17}

Example Input/Output 1:

411522106

Input: 109 107

Output 5

Gode did no

Explanation:

109-1101101 107->1101011

1 position from LSB: Same bit 1

3nd position from LSB: Different bits

5th position from LSB: Same bit 0

7th position from LSB: Same bit 1

101->5

Example Input/Output 2: Input: 206 27

Hello java:14:

System.out

symbol veri

location: class

1 error

Save

FI

F2

F4

Output: -1
*/
