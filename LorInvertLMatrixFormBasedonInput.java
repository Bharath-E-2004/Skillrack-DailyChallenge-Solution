import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        // Read all input lines
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }

        // Check if the first line contains an empty string
        if (list.get(0).contains("")) {
            String[] arr = list.get(0).split(" ");

            // Print reversed array elements with stars
            for (int i = arr.length - 1; i >= 1; i--) {
                for (int j = 0; j < list.size() - 1; j++) {
                    System.out.print("*");
                }
                System.out.println(arr[i]);
            }

            // Print remaining lines in reverse order
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(arr[0]);

        } else {
            String[] arr = list.get(list.size() - 1).split(" ");

            // Print all lines except the last
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(arr[0]);

            // Print remaining array elements with stars
            for (int i = 1; i < arr.length; i++) {
                System.out.println("*".repeat(list.size() - 1) + arr[i]);
            }
        }
    }
}
/*
The program must accept integer values in L-shape or inverted L-shape as the input. The program must flip the given shape diagonally and print the integers as the output. The empty spaces must be printed as asterisks.

Note: Both the edges of L and inverted L have an equal length (Le., an equal number of integers in both the edges).

Input Format:

The lines contain the integer values in L-shape or inverted L-shape.

Output Format:

The lines contain the integer values and asterisks based on the given conditions.
*/
