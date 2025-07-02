import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int asc = 0, desc = 0, equal = 0;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                asc++;
            } else if (arr[i] > arr[i + 1]) {
                desc++;
            } else {
                equal++;
            }
        }                              
     System.out.println(equals==size-1?"Equal":asc==size-1?"Ascending":"Descending");

      System.exit(0);
    }
}
