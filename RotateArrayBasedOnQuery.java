import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            char pos = sc.next().charAt(0);

            if (pos == 'L') {
                int v1 = arr[start];
                while (start < end) {
                    arr[start] = arr[start + 1];
                    start++;
                }
                arr[end] = v1;
            } else {
                int v1 = arr[end];
                while (end > start) {
                    arr[end] = arr[end - 1];
                    end--;
                }
                arr[start] = v1;
            }

            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Example Input/Output 1:

Input:

10 1 2 3 4 5 10 9 876 3

7 10 L

38R

24R

Output:

1 2 3 4 5 10 8 769 127345 10 8 6 9 132745 10869

Explanation:

Here N = 10 and Q = 3.

Query 1: The value of X is 7, the value of Y is 10 and the given character is L. So the integers in the subarray are shifted to the left by 1 position.

Now the array becomes 12345 10 8 7 6 9.

Query 2: The value of X is 3, the value of Y is 8 and the given character is R. So the integers in the subarray are shifted to the right by 1 position.

Now the array becomes 12734 5 10 8 69.

Query 3: The value of X is 2, the value of Y is 4 and the given character is R. So the integers in the subarray are shifted to the right by 1 position.

Now the array becomes 13274 5 10 8 6 9.

Hence the output is

12345 10 8 769 12734510869

13274510869
*/
