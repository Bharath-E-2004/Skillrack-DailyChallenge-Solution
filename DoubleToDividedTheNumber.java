import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int dot = str.indexOf(".");
        int ind = dot - 1;

        // Handle integer part
        for (int i = 0; i < dot; i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            int value = (int) Math.pow(10, ind--);
            System.out.print(digit * value + " ");
        }

        ind = 2; // Start exponent from 2 for fractional part

        // Handle fractional part
        for (int i = dot + 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0') {
                System.out.print("0 ");
            } else {
                int digit = Character.getNumericValue(ch);
                System.out.printf("%d/%d ", digit, (int) Math.pow(10, ind++));
            }
        }

        sc.close();
        System.exit(0);
    }
}
/*
Example Input/Output 1:

Input:

68.12

Output:

60 8 1/10 2/100

Explanation:

Here the given floating point value is 68.12.

The digit 6 is in the tenth place, so 60 is printed.

The digit 8 is in the unit place, so 8 is printed.

The digit 1 is in the one tenth place, so 1/10 is printed.

The digit 2 is in the one hundredth place, so 2/100 is printed.

Example Input/Output 2:

Input:

25005.9089

Output:

20000 5000 0 0 5 9/10 0 8/1000 9/10000

Example Input/Output 3:

Input:

1000.0001

Output

1000 0 0 0 0 0 0 1/10000
*/
