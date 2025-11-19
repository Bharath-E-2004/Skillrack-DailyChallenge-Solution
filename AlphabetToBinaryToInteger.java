import java.util.*;

public class Hello {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine().toLowerCase();

        StringBuilder bin = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; ) {

            // Check if consecutive same characters exist
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                bin.append('1');
                char ch = str.charAt(i);

                // Skip all similar consecutive characters
                while (i < n && str.charAt(i) == ch) {
                    i++;
                }

            } else {
                bin.append('0');
                i++;
            }
        }

        // Convert binary to decimal
        long decimal = Long.parseLong(bin.toString(), 2);

        System.out.println(decimal);
    }
}

/*
The program must accept a string S containing only alphabets as the input. The program must replace all the consecutive occurrences of the alphabets(ignoring case) with 1s and all the remaining alphabets with Os. Finally, the program must print the decimal equivalent of S by considering it as a binary representation.

Boundary Condition(s): 1 <= Length of S <= 50

Input Format: The first line contains S.

Output Format: The first line contains an integer value based on the given conditions.

Example Input/Output 1:

Input:

oops

Output: 12

Explanation: oops-> 1100 -> 12

Example Input/Output 2: Input: AabBCcdeEeg

Output 2030

Explanation:

AabBCcdeleg-> 11111101110 -> 2030
*/
