import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> inside = new ArrayList<>();
        List<Integer> outside = new ArrayList<>();
        boolean[] left = new boolean[N]; // true if (x)y , false if y(x)

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            int open = s.indexOf('(');
            int close = s.indexOf(')');

            int inVal = Integer.parseInt(s.substring(open + 1, close));
            inside.add(inVal);

            if (open == 0) { // (x)y
                int outVal = Integer.parseInt(s.substring(close + 1));
                outside.add(outVal);
                left[i] = true;
            } else { // y(x)
                int outVal = Integer.parseInt(s.substring(0, open));
                outside.add(outVal);
                left[i] = false;
            }
        }

        // Sort inside ascending
        Collections.sort(inside);

        // Sort outside descending
        Collections.sort(outside, Collections.reverseOrder());

        // Print result
        for (int i = 0; i < N; i++) {
            if (left[i]) {
                System.out.print("(" + inside.get(i) + ")" + outside.get(i) + " ");
            } else {
                System.out.print(outside.get(i) + "(" + inside.get(i) + ") ");
            }
        }
    }
}
/*
The program must accept N pairs of integers as the input. One of the two integers in each pair is enclosed within a pair of parentheses. The program must sort the integers that present inside the parentheses in ascending order and sort the integers that present outside the parentheses in descending order. Finally, the program must print N revised pairs as the output.

Boundary Condition(a):

2 <= N <= 100

1 <= Each integer value <= 10^5

Imput Format:

The first line contains N.

The second line contains N pairs of integers separated by a space.

Output Format:

The first line contains the revised N pairs of integers separated by a space.

Example Input/Output

Input

4

12(52) (25)50 (35)10

44(60)

Output

50(25) (35)44 (52)12

10(60)

Explanation:

Here N 4

The 4 integers that present inside the parentheses are 52, 25, 35 and 60.

The 4 integers that present outside the parentheses are 12, 50, 10 and 44.

After sorting those integers in the pairs based on the given conditions, the pairs become

50(25) (35)44 (52)12

10(60)

Example Input/Output 2:

Input:

3 626(564) (343)752 (179)99

Output: 752(179)

(343)626

(504)99
*/
