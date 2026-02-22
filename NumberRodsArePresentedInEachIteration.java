import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        while (!list.isEmpty()) {

            // Print number of rods before cutting
            System.out.println(list.size());

            int min = Collections.min(list);

            // Subtract min from all rods
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) - min);
            }

            // Remove rods that became zero
            list.removeIf(s -> s == 0);
        }
    }
}
/*
The program must accept N integers representing the length of N rods. A boy cuts the rods into smaller rods based on the following conditions.

- He finds the length of the shortest rod. Then he cuts that length from each of the longer rods and then he removes all the pieces of the shortest length. When all the remaining rods are the same length, they cannot be shortened so he removes those rods.

- He repeats the above process until there are no rods left.

The program must print the number of rods remaining before each cutting process.

Boundary Condition(s):

1 <= N, Length of each rod <= 1000

Input Format:

The first line contains N.

The second line contains N integers separated by a space representing the length of N rods.

Output Format:

The lines contain the integer values based on the given conditions.

Example Input/Output 1:

Input:

6 842278

Output:

6 4 3 2
*/
