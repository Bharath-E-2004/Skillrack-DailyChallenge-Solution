import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        // Reading array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing pairwise sums in decreasing window size
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print((arr[j]^=arr[j + 1]) + " ");
            }
            System.out.println();
        }
    }
}
