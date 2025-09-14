import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long result = 0;

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();

            // Convert to binary string
            String bin = Integer.toBinaryString(val);

            // Toggle the first bit (most significant bit)
            char firstBit = bin.charAt(0);
            char toggledBit = (char) ((Character.getNumericValue(firstBit) ^ 1) + '0');

            // Construct new binary string with toggled first bit
            String modifiedBin = toggledBit + bin.substring(1);

            // Convert back to decimal and add to result
            result += Integer.parseInt(modifiedBin, 2);
        }

        // Print the final result
        System.out.println(result);
    }
}

/*
The program must accept N integers as the input. The program must toggle at most one bit in the binary representation of each integer among the N integers so that the sum of N resulting integers is minimum. The program must print the minimum sum as the output.

Boundary Condition(s):

1<= N <= 100 1 <= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains an integer representing the sum of N resulting integers.

Example Input/Output 1:

Input

3

15 10 8

Output: 9

Explanation:

15-1111-0111 -> 7. 10->1010-0010 -> 2. 8-1000-0000-> 0. 7+2+0=9.

Example Input/Output 2:

Input:

4 43 32 77 50

Output

42
*/
