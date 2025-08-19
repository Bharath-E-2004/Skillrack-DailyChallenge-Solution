import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        // Read array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Check for triangle formation using adjacent triples
        for (int i = 0; i <= size - 3; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;

            if (sum - max > max) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
/*
An array of N integers is passed as the input. The program must print how many triangles T can be formed using the adjacent values in the array.

Note: A triangle can be formed with side lengths a, b and c if a+b > c and a+c > band b+c> a.

Boundary Condition(s):

3<= N <= 100

1 <= Each integer value <= 10^4

Input Format:

The first line contains N.

The second line contains the N integer values.

Output Format:

The first line contains T.

Example Input/Output 1:

Input

4

4 5 3 9

Output 1

Explanation:

4 5 3 can form a triangle.

5 3 9 cannot form a triangle.

Example Input/Output 2:

Input

4

4 5 3 6

Output 2
*/
