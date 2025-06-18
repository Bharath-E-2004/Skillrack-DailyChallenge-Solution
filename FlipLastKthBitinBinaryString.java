import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] bin = new String[size];

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            bin[i] = Integer.toBinaryString(val);
        }

        int k = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < size; i++) {
            if (bin[i].length() >= k) {
                char[] array = bin[i].toCharArray();
                int index = bin[i].length() - k;

                array[index] = (array[index] == '0') ? '1' : '0';

                sum += Integer.parseInt(new String(array), 2);
            } else {
                sum += Integer.parseInt(bin[i], 2);
            }
        }

        System.out.println(sum);
    }
}
/*
Example Input/Output 1:

Input:

4 10 31 3 16 3

Output: 64

Explanation:

The binary representation of 10 is 1010.

After flipping the 3 ^ (rd) bit from the end, the 1st integer becomes 14 (1110).

The binary representation of 31 is 11111.

After flipping the 3rd bit from the end, the 2 ^ (nd) integer becomes 27 (11011).

The binary representation of 3 is 11.

The number of bits in the binary representation of 3 is 2, which is less than 3. So the 3 ^ (rd) integer remains the same.

The binary representation of 16 is 10000.

After flipping the 3 ^ (rd) bit from the end, the 4 ^ !h integer becomes 20 (10100).

So their sum is 64 (14 + 27 + 3 + 20)

Example Input/Output 2:

Input

8 14 17 11 14 5 20 8 4

Output 72
*/
