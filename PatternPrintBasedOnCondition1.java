import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();
        int N = sc.nextInt();

        String revS1 = new StringBuilder(S1).reverse().toString();
        int width = S2.length();

        int rungGap = S1.length() - 2; // spaces between top/bottom rails
        String stars = "*".repeat(width - 2);

        int railIndex = 0;

        for (int r = 1; r <= N; r++) {

            // print rail lines before rung
            for (int i = 0; i < rungGap; i++) {
                String rail = (railIndex % 2 == 0) ? S1 : revS1;
                System.out.println(
                        rail.charAt(0) + stars + rail.charAt(rail.length() - 1)
                );
                railIndex++;
            }

            // print rung
            System.out.println(S2);
        }
    }
}

/*
The program must accept two string values S1, S2 and an integer N as the input. The program must print the string ladder pattern based on the following conditions.

- The ladder must have N rungs, where each rung must be formed by the string $2.

- The rungs must be evenly spaced apart.

The two rails of the ladder must be formed by the string S1 and the reverse of St

alternatively as show in the Example Input/Output section.

- The asterisks must be printed instead of the empty spaces in the string ladder pattern.

Note: The first and last characters of $1 and S2 are always same.

Boundary Condition(s):

5<= Length of S1, S2 <= 100

1<=N<=100

Input Format:

The first line contains S1.

The second line contains 52.

The third line contains N.

Output Format:

The lines contain the string ladder pattern as shown in the Example Input/Output section.
*/
