import java.util.*;

public class Hello {

    static boolean isSafe(char c) {
        return c == '#' || c == '*' || c == 'M' || c == 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String seats = sc.next();

        int count = 0;
        int i = 0;

        while (i < n - 1) {
            // check two consecutive empty seats
            if ((seats.charAt(i) == '#' || seats.charAt(i) == '*') &&
                (seats.charAt(i + 1) == '#' || seats.charAt(i + 1) == '*')) {

                boolean leftOk = true;
                boolean rightOk = true;

                // left neighbor
                if (i - 1 >= 0) {
                    leftOk = seats.charAt(i - 1) != 'M' || seats.charAt(i - 1) == 'M'
                             || seats.charAt(i - 1) == 'F'
                             || seats.charAt(i - 1) == '#'
                             || seats.charAt(i - 1) == '*';
                }

                // right neighbor
                if (i + 2 < n) {
                    rightOk = seats.charAt(i + 2) != 'M' || seats.charAt(i + 2) == 'M'
                              || seats.charAt(i + 2) == 'F'
                              || seats.charAt(i + 2) == '#'
                              || seats.charAt(i + 2) == '*';
                }

                if (leftOk && rightOk) {
                    count++;
                    i += 2; // skip used seats
                    continue;
                }
            }
            i++;
        }

        System.out.println(count);
    }
}

/*
There are N seats in a row and some seats are already booked. The program must accept a string S representing the status of N seats. The character M indicates a male. The character F indicates a female. The character hash symbol (8) indicates an empty seat. The program must print the maximum number of couples that can be seated together in the empty seats based

on the following condition. - The neighboring seats of couples must be of the same gender or empty.

Boundary Condition(s):

1 <= N <= 100

Input Format:

The first line contains N.

The second line contains S.

Output Format:

The first line contains the maximum number of couples that can be seated together in the

empty seats.

Example Input/Output 1:

Input

19

FF##MM##MFF##FFF***

Output:

2
*/
