import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                System.out.print(findDistance(str, i) + " ");
            }
        }
    }

    public static int findDistance(String str, int i) {

        int prev = i - 1, next = i + 1;
        boolean leftFound = false, rightFound = false;
        int leftDist = Integer.MAX_VALUE, rightDist = Integer.MAX_VALUE;

        // Search left
        while (prev >= 0) {
            char ch = str.charAt(prev);

            if (ch == '#') break;                // wall blocks
            if (ch == '*') {                     // found charging point
                leftFound = true;
                leftDist = i - prev;
                break;
            }
            prev--;
        }

        // Search right
        while (next < str.length()) {
            char ch = str.charAt(next);

            if (ch == '#') break;                // wall blocks
            if (ch == '*') {                     // found charging point
                rightFound = true;
                rightDist = next - i;
                break;
            }
            next++;
        }

        // No charging on both sides
        if (!leftFound && !rightFound) {
            return -1;
        }
        // Only left charging point
        else if (leftFound && !rightFound) {
            return leftDist;
        }
        // Only right charging point
        else if (!leftFound && rightFound) {
            return rightDist;
        }
        // Both sides -> choose nearest
        else {
            return Math.min(leftDist, rightDist);
        }
    }
}

/*
The program must accept a string S as the input. The string S contains only asterisks("), hash symbols(#), hyphens(-) and the alphabet(L).

- Each asterisk represents a charging point for laptops.

- Each hash symbol represents a wall.

- Each hyphen represents an empty space.

- Each alphabet L. represents a laptop.

For each laptop, the program must print the distance between the laptop and the nearest charging point. If there is no charging point for a laptop, then the program must print -1 for that laptop. If there is a wall between the laptop and the charging point, the laptop cannot be connected to that charging point.

Note: There will be at least one occurrence of L in the string S.

Boundary Condition(s): 1 <= Length of S <= 100

Input Format: The first line contains S.

Output Format:

The first line contains the integer values representing the distance between the laptop and the nearest charging point.
*/
