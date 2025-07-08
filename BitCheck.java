import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String bit1 = Integer.toBinaryString(sc.nextInt());

        boolean bool = true;

        for (int i = 1; i < size; i++) {

            String bit2 = Integer.toBinaryString(sc.nextInt());

            // Ensure same length by taking the last 'bit1.length()' bits from bit2
            String newbit = bit2.length() >= bit1.length()
                    ? bit2.substring(bit2.length() - bit1.length())
                    : String.format("%" + bit1.length() + "s", bit2).replace(' ', '0');

            for (int j = 0; j < bit1.length(); j++) {
                if (!bool) break;

                if (bit1.charAt(j) == '1' && newbit.charAt(j) != '1') {
                    bool = false;
                    break;
                }
            }

            bit1 = bit2;  // Update bit1 for next iteration
        }

        System.out.println(bool ? "YES" : "NO");
    }
}

/*
Example Input/Output 1:

Input:

4 

1 5 7 23

Output:

YES

Explanation

The binary representation of 1 is 1

The binary representation of 5 is 101.

The binary representation of 7 is 111.

The binary representation of 23 is 10111.

The binary growing sequence is 1, 101, 111 and 10111

Example input/Output 2:

Input:

5 

2 10 27 219 731

Output:

YES

Example Input/Output 3:

Input:

4

4 12 57 185

Output: NO
*/
