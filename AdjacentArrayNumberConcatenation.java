import java.util.Scanner;

public class AdjacentArrayNumberConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 1; i < size; i++) {
            String s1 = String.valueOf(arr[i]);
            String s2 = String.valueOf(arr[i - 1]);

            if (Integer.parseInt(s1 + s2) == k) {
                System.out.println(s1 + " " + s2);
            } else if (Integer.parseInt(s2 + s1) == k) {
                System.out.println(s2 + " " + s1);
            }
        }

        sc.close();
    }
}
/*
 Example Input/Output 1:

Input:

6

2 4 8 6 5 11

4

Output:

2 4

4 8

6 8

5 6

Explanation:

Here X = 4.

2 and 4 forms 24 which is divisible by 4.

4 and 8 can form 48 or 84 and both are divisible by 4.

8 and 6 form 68 which is divisible by 4.

6 and 5 form 56 which is divisible by 4.

Example Input/Output 2:

Input

8

84 14 4 2 19 130 8 5 8

12

Output:

8 4

14 4

19 2

130 8

58 8

Example Input/Output 3:

Input:

7

9 3

1 7

3 16

4 19

1 5

Output:

-1
*/
