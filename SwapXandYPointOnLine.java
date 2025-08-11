import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == P) {
                P = y;
            } else if (y == P) {
                P = x;
            }
        }

        System.out.println(P);
    }
}
/*
Input Format:

The first line contains N and P separated by a space.

The next N lines, each contains a pair (X, Y) represents the positions of t swapped.

Output Format:

The first line contains the position of the ball after performing N swaps on

Example Input/Output 1:

Input:

4 2

1 2

3 1

1 2

3 1

Output:

1

Explanation:

Initially, the ball is present at the position 2.

After 1st swap (1, 2), the position of the ball becomes 1.

After 2nd swap (3, 1), the position of the ball becomes 3.

After 3rd swap (1, 2), the ball remains in the same position 3.

After 4th swap (3, 1), the position of the ball becomes 1

Example Input/Output 2:

Input:

4 3

2 1

3 1

3 2

2 1

Output:

2
*/
