import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isAlphabetic(ch)) {
                if (sb.length() > 0 && Character.isDigit(sb.charAt(0))) {
                    System.out.print(sb.reverse());
                    sb.setLength(0);
                }
                sb.append(ch);
            } else {
                if (sb.length() > 0 && Character.isAlphabetic(sb.charAt(0))) {
                    System.out.print(sb.reverse());
                    sb.setLength(0);
                }
                sb.append(ch);
            }
        }

        System.out.print(sb.reverse());
    }
}

/*
The program must accept a string S containing only alphabets and digits as the input. The program must reverse every group of alphabets and every group of digits in the string S. Then the program must print the revised string S as the output.

Boundary Condition(s): 1 <= Length of S <= 1000

Input Format: The first line contains S.

Output Format:

The first line contains the revised string.

Example Input/Output 1:

Input:

abcd1234skillrack994xyz

Output: dcba4321kcarlliks499zyx

Explanation:

1st group (alphabets): abcd -> dcba

2nd group (digits): 1234 -> 4321

3rd group (alphabets): skillrack -> kcarlliks

4th group (digits): 994 -> 499

5th group (alphabets): xyz -> zyx

Example Input/Output 2:

Input:

a1b10cd4ef56

Output a1b01dc4fe65
*/
