import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int val = sc.nextInt();

        for (int i = 0; i < val; i++) {
            arr.add(sc.nextInt());
        }

        boolean found = false;

        // Check for triplets with equal differences
        for (int i = 0; i < val; i++) {
            for (int j = i + 1; j < val; j++) {
                int diff = arr.get(j) - arr.get(i);
                int third = arr.get(j) + diff;

                if (arr.contains(third)) {
                    System.out.println(arr.get(i) + " " + arr.get(j) + " " + third);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        }

        sc.close();
    }
}
/*
Example Input/Output 1:

Input

6

2 3 4 5 8 12

Output:

2 3 4

2 5 8

3 4 5

4 8 12

Explanation:

Here N = 6 and the given 6 integers are 2 3 4 5 8 12.

All the triplets having the same difference between the adjacent integers are given below.

234-> difference is 1 = (3 - 2) = (4 - 3)

258-> difference is 3 = (5 - 2) = (8 - 5)

3 4 5 -> difference is 1 = (4 - 3) = (5 - 4)

48 12-> difference is 4 = (8 - 4) = (12 - 8)

Example Input/Output 2:

Input

5

5 10 20 50 100

Output:

-1
*/
