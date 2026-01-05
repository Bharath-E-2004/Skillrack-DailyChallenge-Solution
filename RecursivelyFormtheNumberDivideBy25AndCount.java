import java.util.*;

public class Hello {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Special case: single digit "0"
        if (s.equals("0")) {
            System.out.println(1);
            return;
        }

        // If starts with 0 and length > 1 → invalid
        if (s.charAt(0) == '0') {
            System.out.println(0);
            return;
        }

        // Collect underscore positions
        List<Integer> underscoreIndex = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                underscoreIndex.add(i);
            }
        }

        // Try all digits for X
        if (s.contains("X")) {
            for (int d = 0; d <= 9; d++) {
                String replaced = s.replace("X", String.valueOf(d));
                solve(replaced, underscoreIndex, 0, new StringBuilder(replaced));
            }
        } else {
            solve(s, underscoreIndex, 0, new StringBuilder(s));
        }

        System.out.println(count);
    }

    static void solve(String base, List<Integer> idx, int pos, StringBuilder sb) {

        if (pos == idx.size()) {
            // Leading zero check
            if (sb.charAt(0) == '0') return;

            int len = sb.length();
            int last2 = Integer.parseInt(sb.substring(len - 2));

            if (last2 % 25 == 0) {
                count++;
            }
            return;
        }

        int i = idx.get(pos);
        for (int d = 0; d <= 9; d++) {
            sb.setCharAt(i, (char) ('0' + d));
            solve(base, idx, pos + 1, sb);
        }

        // Restore underscore (optional safety)
        sb.setCharAt(i, '_');
    }
}

/*
The program must accept a string S representing a number. The string $ contains digits, underscores and X's. The program must print the number of possible integers that can be formed from the string S based on the following conditions.

- All the underscores must be replaced with the digits.

- All X's must be replaced with a same digit.

- The integer must be divisible by 25 and does not contain any leading zeroes.

Boundary Condition(s): 1 <= Length of S <= 7

Input Format:

The first line contains S.

Output Format:

The first line contains an integer value representing the number of possible integers that can be formed from the string S.

Example Input/Output 1:

Input:

8 XX

Output: 10

Explanation:

Here the given string is 8 XX.

The 10 possible integers are given below.

8000

8100

8200

8300

8400

8500

8600

8700

8800
Example Input/Output 2:

Input:

_25

Output: 9

Example Input/Output 3:

Input:

0_75

Output: 0

Explanation:

Here the given string is 0_75.

There is no way to form such integers as the given string starts with 0.

Example Input/Output 4:

Input: 0

Output: 1

Explanation:

Here the given string is 0.

The only integer that can be formed is 0 which is divisible by 25.

Max Execution Time Limit: 50 millisecs
*/
